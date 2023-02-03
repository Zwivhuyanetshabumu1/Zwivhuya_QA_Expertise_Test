package testCases;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.QA_Expertise_Test;
import reusableMethods.ExcelDataSheet;
import testBase.ExtentFactory;
import testBase.TestBase;

public class AutomationTest extends TestBase{
	ExcelDataSheet excel = new ExcelDataSheet("QA");
	QA_Expertise_Test test =  new QA_Expertise_Test();

	
	
	
	@Test(enabled =true, dataProvider = "Data")
	public void TechnicalAssessment(Object obj1) throws Throwable {
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
		ExtentFactory.getInstance().getExtent().info(testData.get("TesctCaseName"));
		
		test.Radio_Button();
		test.Sugesstion(testData);
		test.Check_boxes();
		test.Show_Hide();
		test.Web_Table_Fixed_Header();
		test.iFrame();
		
		
		
	
	
		
	}
	
	
	@DataProvider(name = "Data")
	public Object [][] testDataSupplier() throws Exception {
		Object[][] obj = new Object[excel.getRowCount()][1];
		for(int i = 1; i <= excel.getRowCount(); i++) {
		   HashMap<String, String> testData = excel.getTestDataInMap(i);
		   obj[i-1][0] = testData;
		  
		 
		}
		return obj;
	}
}

	

