package backBasepageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPostUtils {
	
	public NewPostUtils(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//form[contains(@class,'dynamic-form')]/app-input[1]/fieldset/input")
	public WebElement articleTitleTxtBox;
	
	@FindBy(xpath="//form[contains(@class,'dynamic-form')]/app-input[2]/fieldset/input")
	public WebElement aboutArticleTxtBox;
	
	@FindBy(xpath="//textarea[contains(@class,'form-control')]")
	public WebElement writtenArticleTxtBox;
	
	@FindBy(xpath="//form[contains(@class,'dynamic-form')]/app-input[3]/fieldset/input")
	public WebElement enterTagsTxtBox;
	
	@FindBy(xpath="//form[contains(@class,'dynamic-form')]/following::button")
	public WebElement publishArticleButton;
	
	

}
