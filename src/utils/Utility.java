package utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.Base;

public class Utility extends Base {

	public static Object getProperty(Object filename, Object key) throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream((String) filename);
		prop.load(fis);

		return prop.getProperty((String) key);

	}

	public static void waitForVisibilityOfElementLocated(String xpathfile, Object key) throws Exception {
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath((String) Utility.getProperty(xpathfile, key))));
	}

	// wrapper method

	public static void clickUsingXpath(WebDriver dr, String xpathFile, String xpathKey) throws Exception {
		Thread.sleep(2000);
		dr.findElement(By.xpath((String) getProperty(xpathFile, xpathKey))).click();
	}

	public static void typeUsingXpath(WebDriver dr, String xpathFile, String xpathKey, String dataFile,
			String dataToEnter) throws Exception {
		Thread.sleep(2000);
		Actions act = new Actions(dr);
		Action series = (Action) act.moveToElement(dr.findElement(By.xpath((String) getProperty(xpathFile, xpathKey))))
				.sendKeys((String) getProperty(dataFile,dataToEnter)).build();
		series.perform(); 
//		dr.findElement(By.xpath((String)Utility.getProperty(xpathFile, xpathKey))).sendKeys((String) Utility.getProperty(dataFile, dataToEnter));
	}

	public static String getTextUsingXpath(WebDriver dr, String xpathFile, String xpathKey) throws Exception {
		return dr.findElement(By.xpath((String) getProperty(xpathFile, xpathKey))).getText();
	}

}
