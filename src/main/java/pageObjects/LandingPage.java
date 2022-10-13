package pageObjects;

import org.openqa.selenium.By;


import reusableMethods.ActionMethods;
import testBase.DriverFactory;
import testBase.TestBase;

public class LandingPage extends TestBase{
	ActionMethods Action = new ActionMethods();
	
	
	By ResourceButton = By.xpath("(//span[@class='menu-image-title'])[3]");
	By WhitePapers_eBooks = By.xpath("//span[normalize-space()='White Papers & eBooks']");
	
  
	public void NavigateToResource() throws Throwable {
		
		
		Action.moveToElement_custom(DriverFactory.getInstance().getDriver().findElement(ResourceButton), "Navigate To Resource");
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(WhitePapers_eBooks), "White Papers eBooks");
		String ActualPageTitle = DriverFactory.getInstance().getDriver().getTitle();
		Action.assertEqualsString_custom("White Papers | Kurtosys", ActualPageTitle, "Page Title");
	
	}
}
