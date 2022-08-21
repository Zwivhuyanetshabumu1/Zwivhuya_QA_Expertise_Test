package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableMethods.ActionMethods;
import testBase.DriverFactory;
import testBase.TestBase;

public class Login extends TestBase {
	
	ActionMethods Action = new ActionMethods();
	
	By USERNAME = By.xpath("//input[@id='username']");
	By PASSWORD = By.xpath("//input[@id='password']");
	By LOGIN = By.xpath("//input[@id='login']");
	
	
	

	
	
	public void logIn(String Username, String Password) throws Throwable {
		
		Action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(USERNAME), "Login Username Field", Username);
		Action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(PASSWORD), "Login Password Field", Password );
		click_custom(DriverFactory.getInstance().getDriver().findElement(LOGIN), "LoginButton");



		//Username.sendKeys("ZwivhuyaNetshabumu");
		//Password.sendKeys("15Y2U9");
		//Login.click();
		
	}
}

