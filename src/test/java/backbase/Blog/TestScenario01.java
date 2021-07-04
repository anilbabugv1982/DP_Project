package backbase.Blog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestBase.UI.GetDriverInstance;
import UtilClasses.UI.ApplicationLogin;
import UtilClasses.UI.CommonUtils;
import UtilClasses.UI.Log;
import backBasepageObjects.HomePageUtils;
import backBasepageObjects.NewPostUtils;
import backBasepageObjects.PostEditUtils;
import backBasepageObjects.SignInPageUtils;
import backBasepageObjects.SignUpUtils;


public class TestScenario01 extends GetDriverInstance {

	WebDriver backbaseblogDriver;   //Taking driver instance object backbaseblogDriver
	private ApplicationLogin aLoginInstance=null;
	
	
	public static String[] links = null;
	public static int linksCount = 0;

//*************************************************************************************************************************************************	
	
	@BeforeClass(alwaysRun=true)
	public void basetest() throws Exception {
	 backbaseblogDriver=getDriverInstanceObject();
     aLoginInstance= new ApplicationLogin(backbaseblogDriver);
     }

//*************************************************************************************************************************************************	
	@Test(description="This testcase is validating different links in a page",enabled=true)
	public void testcase01() throws Exception {
		aLoginInstance.launchURL(backbaseblogDriver);
		List<WebElement> linksize = backbaseblogDriver.findElements(By.tagName("a")); 
		linksCount = linksize.size();
		System.out.println("Total no of links Available: "+linksCount);
		links= new String[linksCount];
		System.out.println("List of links Available: ");  
		// print all the links from webpage 
		for(int i=0;i<linksCount;i++)
		{
		links[i] = linksize.get(i).getAttribute("href");
		//System.out.println(linksize.get(i).getAttribute("href"));
		CommonUtils.verifyLinks(links[i]);
		
		} 
		
	}
	
//*************************************************************************************************************************************************	
	@Test(description="Validation of Tables",enabled=true)
	public void testcase02() {
		System.out.println("Total number of Rows in the table are : "+ CommonUtils.getRowCountforTable(backbaseblogDriver));

	}
	
//*************************************************************************************************************************************************
   @AfterClass(description="Logout Successfully")
   public void sessionlogout() throws Exception {
	   backbaseblogDriver.quit();
   }
//*************************************************************************************************************************************************   
}
