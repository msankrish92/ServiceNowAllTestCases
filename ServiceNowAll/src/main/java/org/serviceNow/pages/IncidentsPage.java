package org.serviceNow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.serviceNow.api.ProjectSpecificMethod;
import org.testng.Assert;

public class IncidentsPage extends ProjectSpecificMethod {

	public IncidentsPage searchIncident() {

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//a[@class='col-change-sort sort_column_header']/i)[1]")));
		driver.findElementByXPath("//span[contains(text(),\"Press Enter from within\")]//following-sibling::input")
				.click();
		driver.findElementByXPath("//span[contains(text(),\"Press Enter from within\")]//following-sibling::input")
				.sendKeys(createdIncidentNumber);
		driver.findElementByXPath("//span[contains(text(),\"Press Enter from within\")]//following-sibling::input")
				.sendKeys(Keys.ENTER);
		return this;
	}

	public void verifySearchedResult() {
		wait.until(ExpectedConditions
				.refreshed(ExpectedConditions.stalenessOf(driver.findElementByXPath("//a[contains(text(),\"INC\")]"))));

		String text = driver.findElementByXPath("//a[contains(text(),\"INC\")]").getText();
		Assert.assertEquals(text, createdIncidentNumber);
	}

}
