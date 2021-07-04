package backBasepageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpUtils {
	
	public SignUpUtils(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	public WebElement userNameTxtBox;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement passWordTxtBox;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	public WebElement emailTxtBox;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement signInButton;

}
