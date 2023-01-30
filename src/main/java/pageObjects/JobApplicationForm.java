package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import reusableMethods.ActionMethods;
import testBase.DriverFactory;
import testBase.TestBase;

public class JobApplicationForm extends TestBase{
	ActionMethods Action = new ActionMethods();
	
	
	By FirstJob = By.xpath("//a[normalize-space()='Software Quality Assurance (SQA) Lead']");
	By FirstName = By.xpath("//input[@name='firstname']");
	By LastName = By.xpath("//input[@name='lastname']");
	By Email = By.xpath("//input[@name='email']");
	By PhoneNumber = By.xpath("//input[@name='phone']");
	By ValidationText1 = By.xpath("//label[@class='hs-error-msg']");
	By ValidationText2 = By.xpath("//label[@class='hs-main-font-element']");
	By SubmitButton = By.xpath("//input[@type='submit']");

	
	
	
	public void FillinTheFields (HashMap<String, String> testData) throws Throwable {
		
		
		
		DriverFactory.getInstance().getDriver().switchTo().frame("hs-form-iframe-0");
		
		JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
		executor.executeScript("window.scrollBy(0,1000)");
		
		Action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(FirstName), "First Name",testData.get("FirstName"));
		Action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(LastName), "Last Name", testData.get("LastName"));
		Action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(Email), "Email", testData.get("Email"));
		Action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(PhoneNumber), "PhoneNumber", Action.genetatePhoneNumber());
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(SubmitButton), "Submit Button");
		
		
		String ExpectedValidationText1 = "Please complete this required field.";
		String ActualValidationText1 = Action.getText_custom(DriverFactory.getInstance().getDriver().findElement(ValidationText1), "Please complete this required field.");
		Action.assertEqualsString_custom(ActualValidationText1, ExpectedValidationText1, "Validation message displayed as expected ");
		
		String ExpectedValidationText2 = "Please complete all required fields.";
		String ActualValidation2 = Action.getText_custom(DriverFactory.getInstance().getDriver().findElement(ValidationText2), "Please complete all required fields.");
	    Action.assertEqualsString_custom(ExpectedValidationText2, ActualValidation2, "Validation message displayed as expected");
		

		
	}
}
