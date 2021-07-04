package UtilClasses.UI;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import TestBase.UI.GetDriverInstance;




public class ApplicationLogin {

	
	 
	public ApplicationLogin(WebDriver driver) {
		super();
		
	}
	


	
	public void launchURL(WebDriver driver) {

		try {
			System.out.println(GetDriverInstance.EnvironmentName);
			driver.get(GetDriverInstance.EnvironmentName);
			
		} catch (Exception e) {
			System.out.println("Exception in launchURL() ");
			e.printStackTrace();
		}

	}
	

		 
	
	 
}
