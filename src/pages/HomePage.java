package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import junit.framework.Assert;
import utils.Utility;

public class HomePage extends Base {
	
	public void basePageNavigation() throws Exception{
		driver = initializeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	
	@SuppressWarnings("deprecation")
	public void verifyIAmOnFlipKartHomePage(){
		Assert.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", driver.getTitle());
	}
	
	public void searchInSearchInputbox(String value) throws Exception{
		Utility.waitForVisibilityOfElementLocated(xpathfile, "searchInput_box");
		Utility.typeUsingXpath(driver, xpathfile, "searchInput_box", config_file, "mobiles");
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
   

}
