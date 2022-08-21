package pageObjects;

import org.openqa.selenium.By;

public class PolicyHeader {
	
	
	By COVERSTARTDATE = By.xpath("//input[@id='ctl00_cntMainBody_POLICYHEADER__COVERSTARTDATE']");
    By COVERENDDATE = By.xpath("//input[@id='ctl00_cntMainBody_POLICYHEADER__COVERENDDATE']");
    By AGENTCODE = By.xpath("//input[@id='ctl00_cntMainBody_btnAgentCode']");
    By SEARCHAGENTCODE = By.xpath("//input[@id='ctl01_cntMainBody_btnSearch']");
    By SELECTAGENT = By.xpath("//a[@id='ctl01_cntMainBody_grdvSearchResults_ctl02_lnkbtnSelect']");
    By PAYMENTTERM = By.xpath("//select[@id='ctl00_cntMainBody_POLICYHEADER__PAYMENTTERM']");
    By COLLECTIONFREQUENCY = By.xpath("//select[@id='ctl00_cntMainBody_POLICYHEADER__COLLECTIONFREQUENCY']");
    By NEXTBUTTON = By.xpath("//input[@id='ctl00_cntMainBody_btnNext']");

}
