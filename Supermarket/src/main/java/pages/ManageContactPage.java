package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage 
{
	WebDriver driver;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-contact']")WebElement moreinfo;
	@FindBy(xpath="//a[@role='button']")WebElement actionbutton;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//textarea[@name='address']")WebElement address;
	@FindBy(xpath="//textarea[@name='del_time']")WebElement deliverytime;
	@FindBy(xpath="//input[@name='del_limit']")WebElement deliverychargelimit;
	@FindBy(xpath="//button[@name='Update']")WebElement update;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	
	public ManageContactPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void moreInfoManageContact() 
	{
		moreinfo.click();
	}
	public void actionButtonClickMoreInfo() 
	{
		actionbutton.click();
	}
	public void updatePhoneManageContact(String phoneno)
	{
		phone.clear();
		phone.sendKeys(phoneno);
		
	}
	public void updateEmailManageContact(String newemail)
	{
		email.clear();
		email.sendKeys(newemail);
	}
	public void updateAddressManageContact(String newaddress)
	{
		address.clear();
		address.sendKeys(newaddress);
	}
	public void updateDeliveryTimeManageContact(String time)
	{
		deliverytime.clear();
		deliverytime.sendKeys(time);
	}
	public void updateDeliveryChargeLimitManageContact(String chargelimit)
	{
		deliverychargelimit.clear();
		deliverychargelimit.sendKeys(chargelimit);
		
	}
	public void updateManageContact()
	{
		update.click();
	}
	public boolean alertdisplay()
	{
		 return alert.isDisplayed();
		
	}
	
}
