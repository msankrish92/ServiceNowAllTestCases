package org.serviceNow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.serviceNow.api.ProjectSpecificMethod;
import org.testng.Assert;

public class IncidentsPage extends ProjectSpecificMethod {

	public IncidentsPage searchIncident() {
		
		System.out.println("created incident is: "+createdIncidentNumber);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByXPath("//span[contains(text(),\"Press Enter from within\")]//following-sibling::input").click();
		driver.findElementByXPath("//span[contains(text(),\"Press Enter from within\")]//following-sibling::input").sendKeys(createdIncidentNumber);
		driver.findElementByXPath("//span[contains(text(),\"Press Enter from within\")]//following-sibling::input").sendKeys(Keys.ENTER);
		return this;
	}
	
	public void verifySearchedResult() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text = driver.findElementByXPath("//a[contains(text(),\"INC\")]").getText();
		Assert.assertEquals(text, createdIncidentNumber);
	}
	
}
