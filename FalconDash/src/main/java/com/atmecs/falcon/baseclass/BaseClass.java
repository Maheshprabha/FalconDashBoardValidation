package com.atmecs.falcon.baseclass;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.atmecs.falcon.FilePath;
import com.atmecs.falcon.locationreader.LocationReader;

public class BaseClass {
	Properties property;
	public WebDriver driver;

	@BeforeTest
	public void invokeBrowser() throws Exception {
		property = LocationReader.readLocation(FilePath.Config_Path);
		System.setProperty("webdriver.chrome.driver", FilePath.Driver_Path);
		driver = new ChromeDriver();
		String baseUrl = property.getProperty("Url");
		// driver.manage().window().maximize();
		System.out.println(baseUrl);
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

}
