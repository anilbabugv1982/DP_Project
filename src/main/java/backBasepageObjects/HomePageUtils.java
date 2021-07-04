package backBasepageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageUtils {
	
	public HomePageUtils(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	public WebElement homeLink;
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	public WebElement signInLink;
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	public WebElement signUpLink;
	
	@FindBy(xpath="//a[contains(text(),'New Post')]")
	public WebElement newPostLink;
	
	@FindBy(xpath="//a[@class='nav-link'][contains(text(),'Settings')]")
	public WebElement settingsLink;
	
	@FindBy(xpath="//div[@class='tag-list']")
	public By tagListTable;
	
	@FindBy(xpath="//a[contains(text(),'Your Feed')]")
	public WebElement yourFeedTab;
	
	@FindBy(xpath="//a[contains(text(),'Global Feed')]")
	public WebElement globalFeedTab;
	
	@FindBy(xpath="/html/body/app-root/app-home/div/div[2]/div/div[1]/app-article-list/app-article-list-item[1]/div/a/span")
	public WebElement readMorelink;
	
	@FindBy(xpath="/html/body/app-root/app-article/div/div[1]/div/app-article-meta/div/span[2]/button[1]")
	public WebElement followLink;
	
	@FindBy(xpath="/html/body/app-root/app-article/div/div[1]/div/app-article-meta/div/span[2]/button[2]")
	public WebElement favourateLink;
	
	@FindBy(xpath="/html/body/app-root/app-home/div/div[2]/div/div[1]/app-article-list/app-article-list-item[1]/div/a/p")
	public WebElement favarticleText;
	
	@FindBy(xpath="//a[contains(text(),'Favorited Articles')]")
	public WebElement favoriteArticleTab;
	
	@FindBy(xpath="//i[@class='ion-heart']/following::div[1]")
	public WebElement followArticleTab;
	
	@FindBy(xpath="//button[contains(text(),'logout')]")
	public WebElement logoutButton;
	

}
