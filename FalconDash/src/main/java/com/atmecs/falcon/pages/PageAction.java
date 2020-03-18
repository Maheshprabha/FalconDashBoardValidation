package com.atmecs.falcon.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.atmecs.falcon.FilePath;
import com.atmecs.falcon.locationreader.ExcelReader;
import com.atmecs.falcon.property.PropertyReader;

public class PageAction {
	public static WebDriver driver;
	PropertyReader reader = new PropertyReader();

	public static void validateTable(WebDriver driver,int cellNum) throws Exception {

		List<WebElement> table = driver.findElements(By.xpath("//tbody/tr/td"));
		for (int i = 0; i < table.size(); i++) {
		System.out.println("ActualTableValue:" + table.get(i).getText());
		try {
			Assert.assertEquals(table.get(i).getText(), ExcelReader.readData(FilePath.VALID_TABLE, "table", i, cellNum));
			System.out.println("ExpectedTableValue:" + ExcelReader.readData(FilePath.VALID_TABLE, "table", i, cellNum));
			} catch (AssertionError assertionerror) {
				System.out.println("Assertion error");
			}

		}
	}
}