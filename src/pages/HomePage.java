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
	
	public void selectItemUnderMens() throws Exception{
		Utility.waitForVisibilityOfElementLocated(xpathfile, "mens_label");
		Utility.moveToElement(driver, xpathfile, "mens_label");
		Thread.sleep(2000);
		Utility.moveToElementAndClick(driver, xpathfile, "tshirts");
		System.out.println("Clicked on tshirts link");
	}
	
	public void clickOnFirstWishListIcon() throws Exception{
		Utility.waitForVisibilityOfElementLocated(xpathfile, "wishlist_first_icon");
		Utility.moveToElementAndClick(driver, xpathfile, "wishlist_first_icon");
		System.out.println("Clicked on first wishlist icon");
	}
	
	@SuppressWarnings("deprecation")
	public void verifyLoginPopupOpens() throws Exception{
		Utility.waitForVisibilityOfElementLocated(xpathfile, "login_label");
		Assert.assertTrue(Utility.isElementDisplayed(driver, xpathfile, "login_label"));
		System.out.println("Login window displayed");
	}
}
