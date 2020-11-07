package hooks;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.Base;
import utils.Utility;

public class Hooks extends Base {

	@Before
	public void basePageNavigation() throws Exception {
		driver = initializeDriver();
		driver.get((String)Utility.getProperty(config_file, "url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	/*@After
	public void tearDown(){
		driver.quit();
	}  */
}
