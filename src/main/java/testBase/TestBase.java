package testBase;

import java.util.concurrent.TimeUnit;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import reusableMethods.ActionMethods;

import reusableMethods.PropertiesFile;

public class TestBase extends ActionMethods{
	static BrowserFactory BF = new  BrowserFactory();
	

	

	@BeforeMethod
	public static void LuanchBrowser() throws Exception {
		String broswer = PropertiesFile.getPropertyValue("browser");
		
		String url = PropertiesFile.getPropertyValue("url");
		DriverFactory.getInstance().setDriver(BF.creatrBrowserInstance(broswer));
		DriverFactory.getInstance().getDriver().manage().window().maximize();
		DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		DriverFactory.getInstance().getDriver().navigate().to(url);
		
		
		

	}
	
	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();
	}

}
