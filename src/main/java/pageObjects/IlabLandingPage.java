package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import reusableMethods.ActionMethods;
import testBase.DriverFactory;
import testBase.TestBase;

public class IlabLandingPage extends TestBase{
	ActionMethods Action = new ActionMethods();
	
	
	By getInTouch = By.xpath("//a[@href='https://www.ilabquality.com/get-in-touch/']");
	By Career = By.xpath("(//a[text()='Career Opportunities'])[1]");
	By SouthAfrica = By.xpath("//div[@class='et_pb_module et_pb_blurb et_pb_blurb_1 et_clickable et_pb_section_video_on_hover et_pb_text_align_left et_pb_blurb_position_top et_pb_bg_layout_light et_had_animation']");
	By AcceptCookies = By.xpath("//button[@class='cky-btn cky-btn-accept']");
	By FirstJob = By.xpath("(//div[@class=\"et_pb_text_inner\"]/ul/li/a)[1]");
  
	public void NavigateToResource() throws Throwable {
		
		
		Action.moveToElement_custom(DriverFactory.getInstance().getDriver().findElement(getInTouch), "User Houver on Get in Touch Button");
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(Career), "User Click on Career Opportunities");
		
		JavascriptExecutor executor = (JavascriptExecutor) DriverFactory.getInstance().getDriver();
		executor.executeScript("window.scrollBy(0,500)");
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(AcceptCookies), "Accept Cookies");
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(SouthAfrica), "User Click on Career South Africa");
		
		executor.executeScript("window.scrollBy(0,150)");
		Action.click_custom(DriverFactory.getInstance().getDriver().findElement(FirstJob), "User Click on Career Opportunities");
	}
}
