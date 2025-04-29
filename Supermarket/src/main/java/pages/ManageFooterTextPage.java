package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage
{
	WebDriver driver;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-footertext']")WebElement moreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement actionbutton;
	@FindBy(xpath="//textarea[@name='address']")WebElement address;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//button[@name='Update']")WebElement submit;
	@FindBy(xpath="//button[@data-dismiss='alert']")WebElement alert;
	public ManageFooterTextPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void actionButtonCheck()
	{
		if(actionbutton.isDisplayed())
			System.out.println("action button displayed");
		else
			System.out.println("no button");
		
	}
	public void moreInfoClick()
	{
		moreinfo.click();
	}
	public void actionButtonClick()
	{
		actionbutton.click();
		
	}
	public void updateAddress(String addresstoadd)
	{
		address.clear();
		address.sendKeys(addresstoadd);
		
	}
	public void updateEmail(String newemail)
	{
		email.clear();
		email.sendKeys(newemail);
	}
	public void updatephone(String newphone)
	{
		phone.clear();
		phone.sendKeys(newphone);
	}
	public void submit()
	{
		submit.click();
	}
	
	public boolean alertdisplay()
	{
		 return alert.isDisplayed();
		
	}
}
