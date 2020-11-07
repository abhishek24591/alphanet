package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import utils.Utility;

public class HomePage extends Base {
	
	@SuppressWarnings("deprecation")
	public void verifyIAmOnFlipKartHomePage() throws Exception{
		Utility.clickUsingXpath(driver, xpathfile, "close_btn");
		Assert.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", driver.getTitle());
	}
	
	public void searchInSearchInputbox() throws Exception{
		Utility.waitForVisibilityOfElementLocated(xpathfile, "searchInput_box");
		Utility.typeUsingJavaScriptExecutor(driver, xpathfile, "searchInput_box", config_file, "searchValue");
		driver.findElement(By.xpath((String) Utility.getProperty(xpathfile, "searchInput_box"))).sendKeys(Keys.ENTER);
	}
	
	public void selectAddToCompareChkbox() throws Exception{
		boolean status = driver.findElement(By.xpath((String)Utility.getProperty(xpathfile, "addToCompareCheckbox"))).isSelected();
		if(!status){
			Utility.clickUsingXpath(driver, xpathfile, "addToCompareCheckbox");
		}
	}
	
	@SuppressWarnings("deprecation")
	public void verifyCountOfOneInCompare() throws Exception{
		Utility.waitForVisibilityOfElementLocated(xpathfile, "compare_Count_one");
		Assert.assertTrue("Count 1 is not shown for compare", driver.findElement(By.xpath((String)Utility.getProperty(xpathfile, "compare_Count_one"))).isDisplayed());
	}
	
	public void selectItemUnderMens() throws Exception{
		Utility.waitForVisibilityOfElementLocated(xpathfile, "mens_label");
		Utility.moveToElement(driver, xpathfile, "mens_label");
		Thread.sleep(2000);
		Utility.moveToElementAndClick(driver, xpathfile, "tshirts");
		System.out.println("Clicked on tshirts link");
	}
	
	public void clickOnFirstWishListIcon() throws Exception{
		Utility.waitForVisibilityOfElementLocated(xpathfile, "login_label");
		Utility.moveToElementAndClick(driver, xpathfile, "login_label");
	}
	
	public void verifyLoginPopupOpens() throws Exception{
		Utility.waitForVisibilityOfElementLocated(xpathfile, "login_label");
		
	}
   

}
