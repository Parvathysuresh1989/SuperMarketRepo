package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import utilities.ExcelUtilities;


public class LoginTest extends Base
{
	
		@Test(description="Verify whether user is able to login using valid credentials")
		public void verifyWhetherTheUserIsAbleToLoginUsingValidCredentials() throws Exception 
		{
			//String username="admin";
			//String password="admin";
			String username=ExcelUtilities.readStringData(1, 0, "loginpage");
			String password=ExcelUtilities.readStringData(1, 1,"loginpage");
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterUserName(username);
			loginpage.enterPassword(password);
			loginpage.clickSignIn();
			boolean isdashboardloaded=loginpage.isHomePageLoaded();
			Assert.assertTrue(isdashboardloaded,Constants.NOTVALIDCREDENTIAL);
		}
		@Test(description="Verify whether user is not able to login using invalid username and valid password")
		public void verifyWhetherTheUserIsNotAbleToLoginUsingInvalidUserNameAndValidPassword() throws Exception 
		{
			//String username="uname";
			//String password="admin";
			String username=ExcelUtilities.readStringData(2, 0, "loginpage");
			String password=ExcelUtilities.readStringData(2, 1,"loginpage");
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterUserName(username);
			loginpage.enterPassword(password);
			loginpage.clickSignIn();
			boolean isalertdisplayed=loginpage.alertdisplay();
			Assert.assertTrue(isalertdisplayed);
		}
		@Test(groups= {"regression"},description="verify whether the user is not able to login using valid username and invalid password")
		public void verifyWhetherTheUserIsNotAbleToLoginUsingValidUserNameAndInValidPassword() throws Exception 
		{
			//String username="admin";
			//String password="password";
			String username=ExcelUtilities.readStringData(3, 0, "loginpage");
			String password=ExcelUtilities.readStringData(3, 1,"loginpage");
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterUserName(username);
			loginpage.enterPassword(password);
			loginpage.clickSignIn();
			boolean isalertdisplayed=loginpage.alertdisplay();
			Assert.assertTrue(isalertdisplayed);
		}
		@Test(description="verify whether user is not able to login using invalid username and invalid password")
		public void verifyWhetherTheUserIsNotAbleToLoginUsingInValidUserNameAndInValidPassword() throws Exception 
		{
			//String username="username";
			//String password="password";
			String username=ExcelUtilities.readStringData(4, 0, "loginpage");
			String password=ExcelUtilities.readStringData(4, 1,"loginpage");
			LoginPage loginpage=new LoginPage(driver);
			loginpage.enterUserName(username);
			loginpage.enterPassword(password);
			loginpage.clickSignIn();
			boolean isalertdisplayed=loginpage.alertdisplay();
			Assert.assertTrue(isalertdisplayed);
		}
		

}
