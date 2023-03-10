package testBase;

import org.openqa.selenium.WebDriver;


public class DriverFactory {
	
	
	private DriverFactory() {
		
		
	}
	
	private static DriverFactory instance = new DriverFactory();
	
	public static DriverFactory getInstance() {
		return instance;
	}
   ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
   
   public WebDriver getDriver() {
	   return driver.get();
   }
   
   public void setDriver(WebDriver driverParameter) {
	   driver.set(driverParameter);
   }
   public void closeBrowser() {
	   driver.get().quit();
	   driver.remove();
   }
}
