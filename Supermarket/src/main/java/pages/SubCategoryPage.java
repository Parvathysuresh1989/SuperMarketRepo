package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class SubCategoryPage 
{
	WebDriver driver;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']") WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger' and @href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']")WebElement newbutton;
	@FindBy(xpath="//select[@id='cat_id']")WebElement select;
	@FindBy(xpath="//input[@name='main_img']")WebElement selectfile;
	@FindBy(xpath="//input[@id='subcategory']")WebElement subcategory;
	@FindBy(xpath="//button[text()='Save']")WebElement savebutton;
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss' and @href='https://groceryapp.uniqassosiates.com/admin/Subcategory/edit?edit=3537&page_ad=1']")WebElement update;
	@FindBy(xpath="//button[@name='update']")WebElement updatebutton;
	public SubCategoryPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void moreInfoSubcategory() 
	{
		moreinfo.click();
	}
	public void newButtonClickSubCategory() 
	{
		newbutton.click();
		
	}
	public void selectCategory() 
	{
		PageUtility pageutility=new PageUtility();
		pageutility.selectByIndex(select, 3);
	}
	public void chooseFile()
	{
		selectfile.click();
	}
	public void uploadImage()
	{
		FileUploadUtility fileuploadutility=new FileUploadUtility();
		
		fileuploadutility.fileUploadUsingSendKeys(selectfile,Constants.TESTIMAGEDATA);
	}
	public void subCategory(String subcategoryvalue)
	{
		subcategory.sendKeys(subcategoryvalue);
	}
	/*public void clickSave()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", savebutton);
		//savebutton.click();
	}*/
	public void clickSave()
	{
		PageUtility pageutility=new PageUtility();
		pageutility.javaScriptClick(savebutton,driver);
		
	}
	public void updateClick()
	{
		update.click();
	}
	public void updateButtonClick()
	{
		updatebutton.click();
	}
}
