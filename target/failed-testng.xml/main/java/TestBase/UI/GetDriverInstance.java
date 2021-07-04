package TestBase.UI;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ThreadGuard;

public class GetDriverInstance {

	public static String browserName;
    public static String EnvironmentName;
    public static String executionPlatform;
    

	static {
		try {
			FileReader propFileRead = new FileReader(
					"./src/main/java/ConfigurationResources/UI/UIConfiguration.properties");
			Properties fileProperties = new Properties();
			if (propFileRead != null) {
				fileProperties.load(propFileRead);

				executionPlatform = fileProperties.getProperty("executionPlatform");
				if (executionPlatform.equalsIgnoreCase("local")) {
					EnvironmentName = fileProperties.getProperty("EnvironmentName");
				    browserName = fileProperties.getProperty("executableBrowser");
					
				} else {
					EnvironmentName = System.getProperty("EnvironmentName");
					browserName = System.getProperty("ExecutableBrowser");
				}
			}
		} catch (Exception rFE) {
			rFE.printStackTrace();
		}
	}

	public WebDriver driverInstanceObject = null;

	/*
	 * Constructor will read parameters from properties file and create instance of
	 * the browser that was provided in the properties file
	 */
	public WebDriver getDriverInstanceObject() throws WebDriverException {

		FirefoxProfile ffprofile;
		FirefoxOptions ffoptions;

		switch (browserName) {
		case "Firefox":
			System.out.println("FireFox driver Instance");
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
			ffprofile = new FirefoxProfile();
			ffprofile.setPreference("browser.download.folderList", 2);
			ffprofile.setPreference("browser.download.manager.showWhenStarting", false);
			//adding "application/vnd.ms-excel" for saving excel files(.xls) without showing download popup
			ffprofile.setPreference("browser.helperApps.neverAsk.saveToDisk",
					"application/vnd.ms-excel, application/msword, application/csv, application/ris, text/csv, image/png, application/pdf, text/html, text/plain, application/zip, application/x-zip, application/x-zip-compressed, application/download, application/octet-stream");
			ffprofile.setPreference("browser.helperApps.alwaysAsk.force", false);
			ffprofile.setPreference("browser.download.manager.alertOnEXEOpen", false);
			ffprofile.setPreference("browser.download.manager.focusWhenStarting", false);
			ffprofile.setPreference("browser.download.manager.useWindow", false);
			ffprofile.setPreference("browser.download.manager.showAlertOnComplete", false);
			ffprofile.setPreference("browser.download.manager.closeWhenDone", false);
			ffoptions = new FirefoxOptions();
			ffoptions.setProfile(ffprofile);

			driverInstanceObject = new FirefoxDriver(ffoptions);
			break;
		case "Chrome":
			System.out.println("Chrome driver Instance");
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
			/*ChromeOptions coptions= new ChromeOptions();
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("safebrowsing.enabled", "true");
			coptions.setExperimentalOption("prefs", chromePrefs);
			coptions.setAcceptInsecureCerts(true);
			coptions.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);*/
			ChromeOptions chromeOptions= new ChromeOptions(); 
			chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			System.setProperty("webdriver.chrome.driver", "./src/test/java/resources/chromedriver.exe");
			//driverInstanceObject=new ChromeDriver();
			driverInstanceObject = ThreadGuard.protect(new ChromeDriver(chromeOptions));
			break;
		case "IE":
			driverInstanceObject = new InternetExplorerDriver();
			break;
		default:

		}
		driverInstanceObject.manage().window().maximize();
		driverInstanceObject.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driverInstanceObject;
	}

	}
