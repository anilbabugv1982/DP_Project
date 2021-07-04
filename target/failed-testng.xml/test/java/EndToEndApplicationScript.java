import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestBase.UI.GetDriverInstance;
import UtilClasses.UI.ApplicationLogin;
import backBasepageObjects.HomePageUtils;
import backBasepageObjects.NewPostUtils;
import backBasepageObjects.PostEditUtils;
import backBasepageObjects.SignInPageUtils;
import backBasepageObjects.SignUpUtils;

public class EndToEndApplicationScript extends GetDriverInstance{
	
	WebDriver loanITTDriver;   //Taking driver instance object backbaseblogDriver
	private ApplicationLogin aLoginInstance=null;
	private HomePageUtils aHomePageInstance=null;
	private SignInPageUtils aSignInPageInstance=null;
	private SignUpUtils aSignupInstance=null;
	private NewPostUtils aNewPostInstance=null;
	private PostEditUtils aPostEditInstance=null;
	
	public String uname=null;
	public String favArticleText=null;
	
//*************************************************************************************************************************************************	
	
	@BeforeClass(alwaysRun=true)
	public void basetest() throws Exception {
		
	}
//*************************************************************************************************************************************************
	@Test
	public void testscenarios() throws Exception {
		System.setProperty("webdriver.gecko.driver","F:\\DecSeleniumClasses\\lib\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://openbanking.kyiper.ie/car-finance-form/");
		driver.findElement(By.id("cookie_action_close_header")).click();
		System.out.println("Switching iFrame");
		driver.switchTo().frame("advanced_iframe");
		Select dropdown = new Select(driver.findElement(By.id("titleSelect")));
		dropdown.selectByIndex(2);
		
		driver.findElement(By.id("firstName")).sendKeys("anil");
		driver.findElement(By.id("secondName")).sendKeys("kiran");
		driver.findElement(By.id("emailAddress")).sendKeys("keithdoyle@loanitt.ie");
		driver.findElement(By.id("contact-dob")).sendKeys("17/07/1971");
		driver.findElement(By.id("contactNumber")).sendKeys("0874181170");
		driver.findElement(By.id("car_price")).sendKeys("538439469");
		driver.findElement(By.id("depositId")).sendKeys("3846");
		driver.findElement(By.id("outstandingLoan")).sendKeys("567");
		Select dropdownB = new Select(driver.findElement(By.id("carYear")));
		dropdownB.selectByIndex(1);		
		WebElement submitbutton = driver.findElement(By.id("submitButton"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", submitbutton);
		//driver.findElement(By.id("submitButton")).click();
		
		//Thread.sleep(4000);
        
		
		// Wait for initialize, in seconds
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("martialStatus")));
		
		Select dropdown2 = new Select(driver.findElement(By.id("martialStatus")));
		dropdown2.selectByIndex(2);		
		Select dropdown3 = new Select(driver.findElement(By.id("dependents")));
		dropdown3.selectByIndex(1);		
		driver.findElement(By.id("streetName")).sendKeys("140 The Richmond");
		driver.findElement(By.id("townName")).sendKeys("Dublin");
		Select dropdown4 = new Select(driver.findElement(By.id("countySelect")));
		dropdown4.selectByIndex(1);		
		driver.findElement(By.id("postCode")).sendKeys("A96DX72");
		Select dropdown5 = new Select(driver.findElement(By.id("resStatus")));
		dropdown5.selectByIndex(1);		
		Select dropdown6 = new Select(driver.findElement(By.id("addressYears")));
		dropdown6.selectByIndex(1);							
		driver.findElement(By.id("rentPay")).sendKeys("2000");
		Select dropdown7 = new Select(driver.findElement(By.id("bankSelect")));
		dropdown7.selectByIndex(1);	
		Select dropdown8 = new Select(driver.findElement(By.id("bankYearsSelect")));
		dropdown8.selectByIndex(1);	
		driver.findElement(By.id("idNumber")).sendKeys("A123456");
		Select dropdown9 = new Select(driver.findElement(By.id("birthPlaceSelect")));
		dropdown9.selectByIndex(1);	
		
		//driver.findElement(By.id("nextBtn1")).click();
		WebElement nextBtn1 = driver.findElement(By.id("nextBtn1"));
		jse.executeScript("arguments[0].click();", nextBtn1);
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("employerName")));
		driver.findElement(By.id("employerName")).sendKeys("Employer Name");
		driver.findElement(By.id("empStreet")).sendKeys("Employer Street");
		driver.findElement(By.id("empTown")).sendKeys("Employer Town");
		Select dropdown10 = new Select(driver.findElement(By.id("empCountySelect")));
		dropdown10.selectByIndex(1);				
		Select dropdown11 = new Select(driver.findElement(By.id("empStatusSelect")));
		dropdown11.selectByIndex(1);						
		Select dropdown12 = new Select(driver.findElement(By.id("empYearsSelect")));
		dropdown12.selectByIndex(1);					
		driver.findElement(By.id("netIncome")).sendKeys("4000");
		
		//driver.findElement(By.id("nextBtn2")).click();
		Thread.sleep(3000);
		WebElement nextBtn2 = driver.findElement(By.id("nextBtn2"));
		jse.executeScript("arguments[0].click();", nextBtn2);
						
		wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("car_price")));
		//driver.findElement(By.id("car_price")).sendKeys("800");
		//driver.findElement(By.id("carYear")).sendKeys("2019");
		Select dropdown13 = new Select(driver.findElement(By.id("carMakeSelect")));
		dropdown13.selectByIndex(1);
		driver.findElement(By.id("carModel")).sendKeys("Audi");
		
		//driver.findElement(By.id("depositId")).clear();
		//driver.findElement(By.id("depositId")).sendKeys("1000");
		driver.findElement(By.id("carKilometers")).sendKeys("1000");
		//driver.findElement(By.id("outstandingLoan")).clear();
		//driver.findElement(By.id("outstandingLoan")).sendKeys("600");
		Select dropdown14 = new Select(driver.findElement(By.id("selectOpt")));
		dropdown14.selectByIndex(1);	
		
		WebElement ackn=driver.findElement(By.id("age_acknowledgement"));
		jse.executeScript("arguments[0].click();", ackn);
		
		WebElement marketing=driver.findElement(By.id("marketing_consent"));	
		jse.executeScript("arguments[0].click();", marketing);
		System.out.println("Marketing & Age Click");
							
		//driver.findElement(By.id("nextBtn3")).click();
		WebElement nextBtn3 = driver.findElement(By.id("nextBtn3"));
		jse.executeScript("arguments[0].click();", nextBtn3);
		
		wait = new WebDriverWait(driver, 30);
		System.out.println("Submitted Form");	
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("successInformationId")));
		Thread.sleep(5000);
		driver.findElement(By.id("successInformationId"));
		System.out.println("returned success page");	

	}
	
}
