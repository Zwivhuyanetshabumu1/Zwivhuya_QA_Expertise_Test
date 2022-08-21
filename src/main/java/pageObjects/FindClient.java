package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;


import reusableMethods.ActionMethods;
import testBase.DriverFactory;
import testBase.TestBase;

public class FindClient extends TestBase {
	
	By POLICYNUMBER = By.xpath("//input[@id='ctl00_cntMainBody_txtPolicyNumber']");
    By SEACRHCLIENT = By.xpath("//input[@id='ctl00_cntMainBody_btnSearch']");
    By SELECTCLIENT = By.xpath("//a[@id='ctl00_cntMainBody_grdvSearchResults_ctl02_lnkDetails']");
    By SELECTPRODUCT = By.xpath("//select[@id='ctl00_cntMainBody_ctrlNewQuoteImproved_ddlProductlst']");
    By NEWQUOTE = By.xpath("//input[@id='ctl00_cntMainBody_ctrlNewQuoteImproved_btnNewQuote']");
    
    
    ActionMethods Action = new ActionMethods();
    
    public void searcClient(String policynumber) throws Throwable {
    	
    	Action.sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(POLICYNUMBER), "Policy Number",policynumber);
    	Action.click_custom(DriverFactory.getInstance().getDriver().findElement(SEACRHCLIENT), "Search Button");
    	Action.click_custom(DriverFactory.getInstance().getDriver().findElement(SELECTCLIENT), "Select Client button");
    	
    	
    	
    }
}

