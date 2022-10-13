package pageObjects;

import org.openqa.selenium.By;

public class PolicyHeader {
	
	By AgentCodeButton = By.xpath("//input[@id='ctl00_cntMainBody_btnAgentCode']");
	By SearchAgentCode = By.xpath("//input[@id='ctl01_cntMainBody_txtAgent_code']");
	By SearchAgentButton = By.xpath("//input[@id='ctl01_cntMainBody_btnSearch']");
	By SeleectAgentCode = By.xpath("//a[@id='ctl01_cntMainBody_grdvSearchResults_ctl02_lnkbtnSelect']");
	By PaymentTerm = By.xpath("//select[@id='ctl00_cntMainBody_POLICYHEADER__PAYMENTTERM']");
	By CollectionFrequency = By.xpath("//select[@id='ctl00_cntMainBody_POLICYHEADER__PAYMENTTERM']");
	By NextButton = By.xpath("//input[@id='ctl00_cntMainBody_btnNext']");
	By CloseRiskPopUp = By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']");
	
}
