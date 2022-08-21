package testCases;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageObjects.Login;

import reusableMethods.ExcelDataSheet;
import testBase.ExtentFactory;
import testBase.TestBase;

public class Test1 extends TestBase{
	
	Login loginpage = new Login();
	ExcelDataSheet excel = new ExcelDataSheet("Loginpage");
	
	
	@Test(enabled = false, dataProvider = "LoginData")
	public void LoginTestCase1(Object obj1) {
		
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
		ExtentFactory.getInstance().getExtent().info(testData.get("TesctCaseName"));
		//loginpage.logIn(testData.get("Username"), testData.get("Password"));
		

		
	
		//loginpage.logIn(testData.get("Username"), testData.get("Password"));
		
	}
	
	
	@DataProvider(name = "LoginData")
	public Object [][] testDataSupplier() throws Exception {
		Object[][] obj = new Object[excel.getRowCount()][1];
		for(int i = 1; i <= excel.getRowCount(); i++) {
		   HashMap<String, String> testData = excel.getTestDataInMap(i);
		   obj[i-1][0] = testData;
		  
		 
		}
		return obj;
	}
}
