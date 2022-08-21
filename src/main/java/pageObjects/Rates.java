package pageObjects;

import org.openqa.selenium.By;

public class Rates {
	
	By FIRE_AND_EXPLOSION = By.xpath("//input[@id='ctl00_cntMainBody_GROUP_FIRE__FIRE_EXPLOSION_APPL']");
	By SPECIALPERILS= By.xpath("//input[@id='ctl00_cntMainBody_GROUP_FIRE__SPECIAL_PERILS_APPL']");
	By EARTHQUAKE= By.xpath("//input[@id='ctl00_cntMainBody_GROUP_FIRE__EARTHQUAKE_APPL']");
	By MALICIOUSDAMAGE = By.xpath("//input[@id='ctl00_cntMainBody_GROUP_FIRE__MALICIOUS_DAMAGE_APPL']");
	
	By BOOK_FINAL_RATE = By.xpath("//input[@id='ctl00_cntMainBody_GROUP_FIRE__AVG_RATE_BASE_RATE']");
	By LD_FINAL_RATE = By.xpath("//input[@id='ctl00_cntMainBody_GROUP_FIRE__AVG_RATE_ADJ_RATE']");
	By AGREED_FINAL_RATE = By.xpath("//input[@id='ctl00_cntMainBody_GROUP_FIRE__AVG_RATE_AGREED_RATE']");
	
	By NEXTBUTTON = By.xpath("//input[@id='ctl00_cntMainBody_btnNext']");

}
