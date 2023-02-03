package pageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import reusableMethods.ActionMethods;
import testBase.DriverFactory;
import testBase.TestBase;

public class QA_Expertise_Test extends TestBase {

	ActionMethods Action = new ActionMethods();

	By Radio_Button3 = By.xpath("//input[@value='radio1']");
	By Radio_Button2 = By.xpath("//input[@value='radio2']");
	By Suggestion_Field = By.xpath("//input[@id='autocomplete']");
	By Checkbox_Option1 = By.xpath("//input[@id='checkBoxOption1']");
	By Checkbox_Option2 = By.xpath("//input[@id='checkBoxOption1']");
	By Checkbox_Option3 = By.xpath("//input[@id='checkBoxOption1']");
	By Show = By.xpath("//input[@id='show-textbox']");
	By Hide = By.xpath("//input[@id='hide-textbox']");
	By Hide_ShowField = By.xpath("//input[@id='displayed-text']");
	By Amount = By.xpath("//tbody/tr[6]/td[4]");
	By Total_Amount = By.xpath("//div[@class='totalAmount']");
	By Check_Iframe = By.xpath("//iframe[@name='iframe-name']");
	By Register = By.xpath("(//a[@class='theme-btn'])[1]");
	By Republic = By.xpath("//div[@tabindex='-1']");
	
	

	public void Radio_Button() throws Throwable {

		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(Radio_Button3), " Radio Button3 ");
		Action.isElementSelected_custom(DriverFactory.getInstance().getDriver().findElement(Radio_Button3), "Radio Button3");
		
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(Radio_Button2), " Radio Button2 ");
		Action.isElementSelected_custom(DriverFactory.getInstance().getDriver().findElement(Radio_Button2), "Radio Button2");

	}

	public void Sugesstion(HashMap<String, String> testData) throws InterruptedException {

		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(Suggestion_Field),
				" Auto Suggestion field");
		Action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(Suggestion_Field), "Select Country",
				testData.get("SelectCountry"));

		
		
		
		 List<WebElement> country = DriverFactory.getInstance().getDriver().findElements(By.xpath("//li[@class='ui-menu-item']")); 

	        for(int i=0;i<country.size();i++)
	        {
	           if(country.get(i).getText().contains("South Africa"))
	           {
	               
	               Action.click_custom(DriverFactory.getInstance().getDriver().findElements(By.xpath("//li[@class='ui-menu-item']")).get(i), "South Africa");
	           }
	        }

	        
	        Action.clear_custom(DriverFactory.getInstance().getDriver().findElement(Suggestion_Field), "Select Country");
	        Action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(Suggestion_Field), "Select Country",
					testData.get("SelectRepublic"));
	        Thread.sleep(2000);
	       Action.click_custom(DriverFactory.getInstance().getDriver().findElement(Republic), " first County ");
		
	        
	       
		
	}

	public void Check_boxes() {
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(Checkbox_Option1), " Checkbox Option1 ");
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(Checkbox_Option2), " Checkbox Option2 ");
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(Checkbox_Option3), " Checkbox Option3 ");

	}

	public void Show_Hide() {
		
		
		JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
		executor.executeScript("window.scrollBy(0,500)");
		
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(Hide), " Hide Button ");
		Action.isElementPresent_custom(DriverFactory.getInstance().getDriver().findElement(Hide_ShowField), "Hide botton ");
		
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(Show), " Show Button ");
		Action.isElementNotPresent_custom(DriverFactory.getInstance().getDriver().findElement(Hide_ShowField), "Show botton ");
		
		

	}

	public void Web_Table_Fixed_Header() throws Throwable {

		JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
		executor.executeScript("window.scrollBy(0,500)");
		
		
		String expected_Amount = "46";
		String actual_Amount = Action.getText_custom(DriverFactory.getInstance().getDriver().findElement(Amount), "Amount for  ‘Joe Postman’ from ‘Chennai’");
		Action.assertEqualsString_custom(actual_Amount, expected_Amount, "Amount for  ‘Joe Postman’ from ‘Chennai’ ");

		
		String text = Action.getText_custom(DriverFactory.getInstance().getDriver().findElement(Total_Amount), "Total Amount").split(":")[1].trim();
		Action.assertEqualsString_custom(text, "296", "Total Amount ");
	}

	public void iFrame() throws InterruptedException {
		
		JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
		executor.executeScript("window.scrollBy(0,500)");
		DriverFactory.getInstance().getDriver().switchTo().frame("iframe-name");
	
		//Action.isElementPresent_custom(DriverFactory.getInstance().getDriver().findElement(Check_Iframe), "iframe");
		
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(Register), " Register button in Iframe");

	}

}
