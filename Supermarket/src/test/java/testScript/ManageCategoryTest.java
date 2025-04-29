package testScript;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtilities;
import utilities.FakerUtility;

public class ManageCategoryTest extends Base
{
	@Test
	public void manageCategory() throws Exception
	{
		FakerUtility fakerutility=new FakerUtility();
		String username=ExcelUtilities.readStringData(1, 0, "loginpage");
		String password=ExcelUtilities.readStringData(1, 1,"loginpage");
		String category="foodfood";
		//String category=fakerutility.creatARandomFirstName();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignIn();
		ManageCategoryPage managecategorypage=new ManageCategoryPage(driver);
		managecategorypage.manageCategoryMoreInfoClick();
		managecategorypage.manageCategoryNewButtonClick();
		managecategorypage.category(category);
		managecategorypage.selectGroup();
		managecategorypage.uploadImage();
		//managecategorypage.showOnTopMenu();
		//managecategorypage.showOnLeftMenu();
		managecategorypage.saveButtonClick();
	}
}
