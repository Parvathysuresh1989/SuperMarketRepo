package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtilities;

public class ManageContactTest extends Base
{
	@Test(groups= {"regression"},description="update contact details")
	public void manageContact() throws Exception 
	{
		String username=ExcelUtilities.readStringData(1, 0, "loginpage");
		String password=ExcelUtilities.readStringData(1, 1,"loginpage");
		String phone=ExcelUtilities.readIntegerData(1, 0,"managecontact");
		String email=ExcelUtilities.readStringData(1, 1,"managecontact");
		String address=ExcelUtilities.readStringData(1, 2,"managecontact");
		String deliverytime=ExcelUtilities.readIntegerData(1, 3,"managecontact");
		String deliverycharge=ExcelUtilities.readIntegerData(1, 4,"managecontact");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignIn();
		ManageContactPage managecontactpage=new ManageContactPage(driver);
		managecontactpage.moreInfoManageContact();
		managecontactpage.actionButtonClickMoreInfo();
		managecontactpage.updatePhoneManageContact(phone);
		managecontactpage.updateEmailManageContact(email);
		managecontactpage.updateAddressManageContact(address);
		managecontactpage.updateDeliveryTimeManageContact(deliverytime);
		managecontactpage.updateDeliveryChargeLimitManageContact(deliverycharge);
		managecontactpage.updateManageContact();
		boolean alertmessage=managecontactpage.alertdisplay();
		Assert.assertTrue(alertmessage);
		
		
		
		
	}
}
