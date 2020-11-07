package pages;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


public class Base {

	public static WebDriver driver;
	public static String xpathfile,config_file;
	Properties p = new Properties();
	
	public WebDriver initializeDriver() throws Exception {
		config_file = System.getProperty("user.dir") + "//config//config.properties";
		xpathfile = System.getProperty("user.dir") + "//config//object_repository.properties";
		FileInputStream fip = new FileInputStream(System.getProperty("user.dir") + "\\config\\config.properties");
		p.load(fip);
		String browserName = p.getProperty("browsername");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\OxygenWorkspace\\Alphanet\\Flipkart\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}

}
