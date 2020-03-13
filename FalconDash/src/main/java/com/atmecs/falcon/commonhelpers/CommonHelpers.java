package com.atmecs.falcon.commonhelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.atmecs.falcon.FilePath;
import com.atmecs.falcon.property.PropertyReader;

public class CommonHelpers {
	PropertyReader reader = new PropertyReader();

	public static void webElement(WebDriver driver, String elementPath, String actual, String expected) {
		driver.findElement(By.xpath(elementPath)).getText();
		System.out.println("");
	}

	public static void SendkeysAction(WebDriver driver, String elementPath, String value) {
		driver.findElement(By.xpath(elementPath)).sendKeys(value);
	}

	public static void clickAction(WebDriver driver, String elementPath) {
		driver.findElement(By.xpath(elementPath)).click();
	}

	public static String findElement(WebDriver driver, String path) {
		String elementList = driver.findElement(By.xpath(path)).getText();
		System.out.println(elementList);
		return elementList;
	}

	public static void validate(WebDriver driver, String actual, String expected) {
		Assert.assertEquals(actual, expected);
		System.out.println(" Passed : " + " Expected : " + expected + " Actual : " + actual);
	}

	public static void imageValidation(WebDriver driver, String actual) {
		boolean validimage = driver.findElement(By.xpath(actual)).isDisplayed();
		try {
			Assert.assertEquals(validimage, true);
			System.out.println("image is present in the page");
		} catch (AssertionError e) {
			System.out.println("image is not present in the page" + e.getMessage());
		}
	}

	public static Boolean validateAttribute(WebDriver driver, String xpath, String attribute,
			String expectedAttribute) {
		String actualAttribute = driver.findElement(By.xpath(xpath)).getAttribute(attribute);
		try {
			Assert.assertEquals(actualAttribute, expectedAttribute);
			System.out.println("Expected attribute:" + actualAttribute);
		} catch (AssertionError assertionfailure) {
			System.out.println("Attribute not found");
		}
		return true;
	}

	public void getValueText(WebDriver driver, String xpath) {
		for (int initial = 1; initial <= 6; initial++) {
			if (driver.findElement(By.xpath(xpath)).getText().equalsIgnoreCase("text")) {
				System.out.println("Element is valid");
			} else {
				System.out.println("Element is not valid");
			}
		}
	}

	public static void explicitWait(WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, FilePath.page_load_timeout);
		WebElement element;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		element.click();
	}

	public static void getValueText(WebDriver driver, String xpath, String actual, String expected) {
		String actualtext = driver.findElement(By.xpath(xpath)).getText();
		System.out.println("Actual :" + actualtext);
	}

	String expected = reader.propertyRead("Dash_validpath", "restapi");
	{
		System.out.println("Expected :" + expected);

	}
}