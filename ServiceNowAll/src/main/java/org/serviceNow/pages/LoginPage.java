package org.serviceNow.pages;

import org.serviceNow.api.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {

	public LoginPage enterUserName() {
		driver.findElementById("user_name").sendKeys("admin");
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElementById("user_password").sendKeys("Dec@1234");
		return this;
	}
	
	public HomePage clickLoginButton() {
		driver.findElementById("sysverb_login").click();
		return new HomePage();
	}
	
}
