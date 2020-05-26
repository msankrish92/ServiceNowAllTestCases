package org.serviceNow.TestCases;

import org.serviceNow.api.ProjectSpecificMethod;
import org.serviceNow.pages.LoginPage;
import org.testng.annotations.Test;

public class TC001_CreateNewIncident extends ProjectSpecificMethod {
	//first test case
	@Test
	public void createNewIncident() throws InterruptedException {
		driver.switchTo().frame("gsft_main");
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.enterIncidentInFilterNavigator()
		.clickOnCreateNew()
		.clickCallerSearchButton()
		.getCreatingIncidentNumber()
		.enterShortDescription()
		.clickSubmit()
		.searchIncident()
		.verifySearchedResult();
	}
	
}
