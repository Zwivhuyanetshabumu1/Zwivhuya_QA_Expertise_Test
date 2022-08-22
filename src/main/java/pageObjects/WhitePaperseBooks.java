package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import reusableMethods.ActionMethods;
import testBase.DriverFactory;
import testBase.TestBase;

public class WhitePaperseBooks extends TestBase{
	ActionMethods Action = new ActionMethods();
	
	
	By UCITS_White_Paper = By.xpath("//a[contains(text(),'UCITS White Paper')]");
	By FirstName = By.xpath("//input[@id='18882_231669pi_18882_231669']");
	By LastName = By.xpath("//input[@id='18882_231671pi_18882_231671']");
	By Company = By.xpath("//input[@id='18882_231675pi_18882_231675']");
	By Industry = By.xpath("//input[@id='18882_231677pi_18882_231677']");
	By Subscribe = By.xpath("//label[@for='18882_234828pi_18882_234828_3080800']");
	By SendButton = By.xpath("//input[@type='submit']");
	By ValidationMessage = By.xpath("//p[@class='error no-label']");
	By Iframe = By.xpath("(//div[@class='elementor-post__card'])[4]");
	
	
	
	public void FillinTheFields (HashMap<String, String> testData) {
		
		JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
		executor.executeScript("window.scrollBy(0,500)");
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(UCITS_White_Paper), "UCITS White Paper");
		JavascriptExecutor executors = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
		executors.executeScript("window.scrollBy(0,300)");
		DriverFactory.getInstance().getDriver().switchTo().frame(0);
		Action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(FirstName), "First Name",testData.get("FirstName"));
		Action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(LastName), "Last Name", testData.get("LastName"));
		Action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(Company), "Company", testData.get("Company"));
		Action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(Industry), "Industry", testData.get("Industry"));
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(Subscribe), "Subscribe to our newsletter");
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(SendButton), "Send me a Copy");
		Action.getText_custom(DriverFactory.getInstance().getDriver().findElement(ValidationMessage), "Pop error message");
		
		

		
	}
}
