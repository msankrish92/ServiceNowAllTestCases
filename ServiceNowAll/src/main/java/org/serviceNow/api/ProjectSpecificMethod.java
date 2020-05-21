package org.serviceNow.api;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {

	
	public static RemoteWebDriver driver;
	
	public static WebDriverWait wait;
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedrivers.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev89232.service-now.com");
		wait = new WebDriverWait(driver, 20); 
	}
	
	
	
}
