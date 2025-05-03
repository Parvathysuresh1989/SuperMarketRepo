package testScript;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtilities;
import utilities.FakerUtility;

public class SubCategoryTest extends Base
{
	@Test(groups= {"regression"},description="adding subcategory")
	public void addSubCategory() throws Exception
	{
		FakerUtility fakerutility=new FakerUtility();
		String username=ExcelUtilities.readStringData(1, 0, "loginpage");
		String password=ExcelUtilities.readStringData(1, 1,"loginpage");
		//String subcategory="fruitapplefruit";
		String subcategory=fakerutility.creatARandomFirstName();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignIn();
		SubCategoryPage subcategorypage=new SubCategoryPage(driver);
		subcategorypage.moreInfoSubcategory();
		subcategorypage.newButtonClickSubCategory();
		subcategorypage.selectCategory();
		subcategorypage.subCategory(subcategory);
		//subcategorypage.chooseFile();
		subcategorypage.uploadImage();
		
		subcategorypage.clickSave();
	}
	@Test(groups= {"regression"},description="update subcategory")
	public void updateSubCategory() throws Exception
	{
		FakerUtility fakerutility=new FakerUtility();
		String username=ExcelUtilities.readStringData(1, 0, "loginpage");
		String password=ExcelUtilities.readStringData(1, 1,"loginpage");
		//String subcategory="fruitfrutapple";
		String subcategory=fakerutility.creatARandomFirstName();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(username);
		loginpage.enterPassword(password);
		loginpage.clickSignIn();
		SubCategoryPage subcategorypage=new SubCategoryPage(driver);
		subcategorypage.moreInfoSubcategory();
		subcategorypage.updateClick();
		subcategorypage.subCategory(subcategory);
		subcategorypage.updateButtonClick();
		
	}
}
