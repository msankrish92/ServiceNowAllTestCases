package org.serviceNow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.serviceNow.api.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{

	public HomePage enterIncidentInFilterNavigator() {
		wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("(//div[text()='Homepage'])[1]")));
		driver.findElementById("filter").sendKeys("Incident",Keys.ENTER);
		return this;
	}
	
	public CreateIncidentPage clickOnCreateNew() {
		driver.switchTo().frame(0);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("headline")));
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//div[text()='Create New']").click();
		return new CreateIncidentPage();
	}
	
	
}
