package pages;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;
import utils.Utility;

public class HomePage extends Base {
	
	public void basePageNavigation() throws Exception{
		driver = initializeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public void loginIntoApplication() throws Exception{
		Thread.sleep(2000);
		Utility.typeUsingXpath(driver, xpathfile, "passwordField_xpath", config_file, "password");
		Utility.waitForVisibilityOfElementLocated(xpathfile, "emailPhoneNoField_xpath");
		Utility.typeUsingXpath(driver, xpathfile, "emailPhoneNoField_xpath", config_file, "mobileNumber");
//		Utility.waitForVisibilityOfElementLocated(xpathfile, "passwordField_xpath");
		Thread.sleep(2000);
//		Utility.typeUsingXpath(driver, xpathfile, "passwordField_xpath", config_file, "password");
//		Utility.waitForVisibilityOfElementLocated(xpathfile, "loginBtn_xpath");
//		Utility.clickUsingXpath(driver, xpathfile, "loginBtn_xpath");
//		Utility.clickUsingXpath(driver, xpathfile, "close_btn");
		System.out.println("Title is --> " + driver.getTitle());
	}
	
	@SuppressWarnings("deprecation")
	public void verifyIAmOnFlipKartHomePage(){
		Assert.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", driver.getTitle());
	}
	
   

}
