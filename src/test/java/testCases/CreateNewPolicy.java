package testCases;

import org.testng.annotations.Test;

import pageObjects.FindClient;
import testBase.TestBase;

public class CreateNewPolicy extends TestBase{
	
	FindClient findclient = new FindClient();
	
	@Test
	public void Find_Client_By_PolicyNumber() throws Throwable  {
		
		findclient.searcClient(" JHB/HAPANQ/000248944");
	}

}
