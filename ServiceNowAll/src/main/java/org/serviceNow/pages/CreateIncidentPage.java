package org.serviceNow.pages;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.serviceNow.api.ProjectSpecificMethod;

import cucumber.api.java.sr_latn.I;

public class CreateIncidentPage extends ProjectSpecificMethod {

	public CreateIncidentPage clickCallerSearchButton() {
		driver.switchTo().frame(0);
		wait.until(ExpectedConditions.textToBePresentInElement(
		driver.findElementByXPath("//div[@class='cxs_result_static_message']"), "No results to display"));
		driver.findElementById("lookup.incident.caller_id").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindowHandles = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listWindowHandles.get(1));
		driver.findElementByXPath("//a[text()='Abel Tuter']").click();
		
		driver.switchTo().window(listWindowHandles.get(0));
		driver.switchTo().frame(0);
		
		
		
		return this;
		
	}
	
	public CreateIncidentPage getCreatingIncidentNumber() {
		createdIncidentNumber = driver.findElementById("incident.number").getAttribute("value");
		return this;
	}
	
	public CreateIncidentPage enterShortDescription() {
		driver.findElementById("incident.short_description").sendKeys("Issue raised for system malfunction");
		return this;
	}
	
	public IncidentsPage clickSubmit() {
		driver.findElementByXPath("//button[text()='Submit']").click();
		return new IncidentsPage();	
	}
}
