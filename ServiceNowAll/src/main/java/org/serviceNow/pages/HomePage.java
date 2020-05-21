package org.serviceNow.pages;

import org.serviceNow.api.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{

	public void enterIncidentInFilterNavigator() {
//		wait.
		driver.findElementById("filter").sendKeys("Incident");
	}
	
	
}
