package com.maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	@Test
	public void setup() {
		
		//System.setProperty("webdriver.chrome.driver", "src\\Drivers\\chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
	}
}
