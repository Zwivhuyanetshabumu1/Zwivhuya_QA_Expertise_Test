package testCases;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.IlabLandingPage;
import pageObjects.JobApplicationForm;
import reusableMethods.ExcelDataSheet;
import testBase.ExtentFactory;
import testBase.TestBase;

public class llabeAssessment extends TestBase{
	ExcelDataSheet excel = new ExcelDataSheet("Ilab");
	JobApplicationForm ilab = new JobApplicationForm();
	IlabLandingPage landingpage = new IlabLandingPage();

	
	
	
	@Test(enabled =true, dataProvider = "Data")
	public void IlabTechnicalAssessment(Object obj1) throws Throwable {
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
		ExtentFactory.getInstance().getExtent().info(testData.get("TesctCaseName"));
		
		landingpage.NavigateToResource();
		ilab.FillinTheFields(testData);
		
		
	
	
		
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

	

