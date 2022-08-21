package pageObjects;

import org.openqa.selenium.By;

public class RiskSelection {
	
	By ACCIDENTALDAMAGEOTHER = By.xpath("//input[@id='ctl00_cntMainBody_GROUP_FIRE__SECTION_AD_APPL']");
	By ACCIDENTALDAMAGEWINES = By.xpath("//input[@id='ctl00_cntMainBody_GROUP_FIRE__SECTION_ADW_APPL']");
	By CONSTRUCTIONTYPE = By.xpath("//select[@id='ctl00_cntMainBody_GROUP_FIRE__TYPE_CONSTRUCTION']");
	By AD_OTHER_CLAIMS_0_TO_12_MONTHS = By.xpath("//select[@id='ctl00_cntMainBody_GROUP_FIRE__AD_CLAIMS_0_TO_12_MONTHS']");
	By AD_OTHER_CLAIMS_13_TO_24_MONTHS = By.xpath("//select[@id='ctl00_cntMainBody_GROUP_FIRE__AD_CLAIMS_13_TO_24_MONTHS']");
	By AD_OTHER_CLAIMS_25_TO_36_MONTHS = By.xpath("//select[@id='ctl00_cntMainBody_GROUP_FIRE__AD_CLAIMS_25_TO_36_MONTHS']");
	By AD_WINE_CLAIMS_0_TO_12_MONTHS = By.xpath("//select[@id='ctl00_cntMainBody_GROUP_FIRE__ADW_CLAIMS_0_TO_12_MONTHS']");
	By AD_WINE_CLAIMS_13_TO_24_MONTHS = By.xpath("//select[@id='ctl00_cntMainBody_GROUP_FIRE__ADW_CLAIMS_13_TO_24_MONTHS']");
	By AD_WINE_CLAIMS_25_TO_36_MONTHS = By.xpath("//select[@id='ctl00_cntMainBody_GROUP_FIRE__ADW_CLAIMS_25_TO_36_MONTHS']");
    By NEXTBUTTON = By.xpath("//input[@id='ctl00_cntMainBody_btnNext']");

}
