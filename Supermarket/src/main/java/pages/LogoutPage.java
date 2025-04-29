package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
	WebDriver driver;
	@FindBy(xpath="//img[@alt='User Image'and @class='img-circle']")WebElement admin;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")WebElement logout;
	@FindBy(xpath="//b[text()='7rmart supermarket']") WebElement signinpage;
	public LogoutPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickAdmin()
	{
		admin.click();
	}
	public void clickLogout()
	{
		logout.click();
	}
	public boolean isSigninPageLoaded()
	{
		return signinpage.isDisplayed();
	}
}
