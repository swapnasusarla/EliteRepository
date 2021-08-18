package org.iit.hc.patientmodule.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	@Test
	public void LoginTests() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String actual = driver.getTitle();
		String Expected = "Google";
		Assert.assertEquals(actual, Expected);
		driver.close();
	}

}

