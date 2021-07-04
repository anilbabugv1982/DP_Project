package backBasepageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostEditUtils {
	
	public PostEditUtils(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='container']//app-article-meta//div[@class='article-meta']//span//button[@class='btn btn-sm btn-outline-danger'][contains(text(),'Delete Article')]")
	public WebElement deleteArticleBtn;
	
	@FindBy(xpath="//div[@class='container']//app-article-meta//div[@class='article-meta']//span//a[@class='btn btn-sm btn-outline-secondary'][contains(text(),'Edit Article')]")
	public WebElement editArticleBtn;
	
	@FindBy(xpath="//textarea[contains(@placeholder,'Write a comment')]")
	public WebElement editComment;
	
	@FindBy(xpath="//div[@class='card-footer']/button")
	public WebElement buttonPostComment;
}
