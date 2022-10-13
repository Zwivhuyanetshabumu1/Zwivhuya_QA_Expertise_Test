package pageObjects;

import org.openqa.selenium.By;

public class FindClient {
	
	By ClientCode = By.xpath("//input[@id='ctl00_cntMainBody_txtClientCode']");
	By SearchButton = By.xpath("//input[@id='ctl00_cntMainBody_btnSearch']");
	By SelectClient  = By.xpath("//a[@id='ctl00_cntMainBody_grdvSearchResults_ctl02_lnkDetails']\r\n"+ "");
	
}
