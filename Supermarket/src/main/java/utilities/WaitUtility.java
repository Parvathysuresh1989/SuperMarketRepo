package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility 
{
	public static final int EXPLICIT_WAIT = 10;
	public static final int IMPLICIT_WAIT=10;
	WebDriverWait wait;


		public void waitForElementToBeClickable(WebDriver driver,WebElement element) 
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		    wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		public void waitForVisibilityOfTheElement(WebDriver driver,String xpath,long time)
		{
			wait = new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		}
		
		public void waitForInVisibilityOfTheElement(WebDriver driver,String xpath,long time)
		{
			wait = new WebDriverWait(driver,Duration.ofSeconds(time));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
		}
		
		public void waitForAlertToBePresent(WebDriver driver, long time) {
		    wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		    wait.until(ExpectedConditions.alertIsPresent());
		}

}
