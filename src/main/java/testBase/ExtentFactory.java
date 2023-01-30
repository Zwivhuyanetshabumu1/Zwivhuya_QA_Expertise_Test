package testBase;

import com.aventstack.extentreports.ExtentTest;

public class ExtentFactory {
	
	
private ExtentFactory() {
		
	}
	
	private static ExtentFactory instance = new ExtentFactory();
	
	public static ExtentFactory getInstance() {
		return instance;
	}
   static ThreadLocal<ExtentTest> extent = new ThreadLocal<ExtentTest>();
   
   public static ExtentTest getExtent() {
	   return extent.get();
   }
   
   public void setExtent(ExtentTest extentTestObject) {
	   extent.set(extentTestObject);
   }
   public void removeExtentObject() {
	   extent.remove();
   }

}
