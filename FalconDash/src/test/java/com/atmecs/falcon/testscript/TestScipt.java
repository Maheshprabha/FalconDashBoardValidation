package com.atmecs.falcon.testscript;

import java.util.List;
import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.falcon.FilePath;
import com.atmecs.falcon.baseclass.BaseClass;
import com.atmecs.falcon.commonhelpers.CommonHelpers;
import com.atmecs.falcon.dataallcator.DataLocator;
import com.atmecs.falcon.dataallcator.ValidAllacator;
import com.atmecs.falcon.dataallcator.ValidLocator;
import com.atmecs.falcon.locationreader.LocationReader;
import com.atmecs.falcon.property.PropertyReader;

public class TestScipt extends BaseClass {

	Properties property;
	DataLocator path_name = new DataLocator();
	ValidAllacator valid_name = new ValidAllacator();
	PropertyReader reader = new PropertyReader();
	ValidLocator valid_path = new ValidLocator();
	LocationReader read = new LocationReader();

	@Test
	public void action() throws Exception {
		path_name.getPathData();
		valid_name.getvalidData();
		valid_path.getPathValid();

		property = read.readLocation(FilePath.locator_path);
		CommonHelpers.clickAction(driver, property.getProperty("loc_dashboard"));
		CommonHelpers.clickAction(driver, property.getProperty("loc_restapi"));
		

		CommonHelpers.explicitWait(driver, property.getProperty("loc_falcon"));
		// Filter by Dropdowns
		CommonHelpers.dropdown(driver, property.getProperty("loc_falcon"), "Falcon");

		CommonHelpers.dropdown(driver, property.getProperty("loc_createfalconpost"), "createFalconPosts");

//		CommonHelpers.explicitWait(driver, property.getProperty("loc_tablevalue"));
		List<WebElement> footers = CommonHelpers.headervalidate(driver, property.getProperty("loc_tablevalue"));
		System.out.println(footers.size());
		for (int index = 0; index < footers.size(); index++) {
			System.out.println(footers.get(index).getText());
		}
		CommonHelpers.validateTableValue(driver, footers.get(0).getText(), path_name.deletetestcase);
		CommonHelpers.validateTableValue(driver, footers.get(1).getText(), path_name.downloadapiresult);
		CommonHelpers.validateTableValue(driver, footers.get(2).getText(), path_name.exporttestcasename);
		CommonHelpers.validateTableValue(driver, footers.get(3).getText(), path_name.getteastcasename);
		CommonHelpers.validateTableValue(driver, footers.get(4).getText(), path_name.invalidtestcase);
		CommonHelpers.validateTableValue(driver, footers.get(5).getText(), path_name.recenttestcase);
		CommonHelpers.validateTableValue(driver, footers.get(6).getText(), path_name.reporttestcase);
		CommonHelpers.validateTableValue(driver, footers.get(7).getText(), path_name.uploadtestcase);
		CommonHelpers.validateTableValue(driver, footers.get(8).getText(), path_name.filetestcase);
		CommonHelpers.validateTableValue(driver, footers.get(9).getText(), path_name.viewtestcase);
		// Filter by Pass
		CommonHelpers.dropdown(driver, property.getProperty("loc_pass"), "Pass");
		// CommonHelpers.explicitWait(driver, property.getProperty("(//tbody/tr/td)"));
		Thread.sleep(2000);
		List<WebElement> footers1 = CommonHelpers.headervalidate(driver, property.getProperty("loc_tablevalue"));
		System.out.println(footers1.size());
		for (int index = 0; index < footers1.size(); index++) {
			System.out.println(footers1.get(index).getText());
		}
		CommonHelpers.validateTableValue(driver, footers1.get(0).getText(), path_name.deletetestcase);
		CommonHelpers.validateTableValue(driver, footers1.get(1).getText(), path_name.downloadapiresult);
		CommonHelpers.validateTableValue(driver, footers1.get(2).getText(), path_name.exporttestcasename);
		CommonHelpers.validateTableValue(driver, footers1.get(3).getText(), path_name.getteastcasename);
		CommonHelpers.validateTableValue(driver, footers1.get(4).getText(), path_name.recenttestcase);
		CommonHelpers.validateTableValue(driver, footers1.get(5).getText(), path_name.reporttestcase);
		CommonHelpers.validateTableValue(driver, footers1.get(6).getText(), path_name.uploadtestcase);
		CommonHelpers.validateTableValue(driver, footers1.get(7).getText(), path_name.filetestcase);
		CommonHelpers.validateTableValue(driver, footers1.get(8).getText(), path_name.viewtestcase);
		// Filter by Fail

		CommonHelpers.dropdown(driver, property.getProperty("loc_pass"), "Fail");
		// CommonHelpers.explicitWait(driver, property.getProperty("(//tbody/tr/td)"));
		Thread.sleep(2000);

		List<WebElement> footers2 = CommonHelpers.headervalidate(driver, property.getProperty("loc_tablevalue"));
		System.out.println(footers2.size());
		for (int index = 0; index < footers2.size(); index++) {
			System.out.println(footers2.get(index).getText());
		}
		CommonHelpers.validateTableValue(driver, footers2.get(0).getText(), path_name.invalidtestcase);
		// Filter by Skip
		CommonHelpers.dropdown(driver, property.getProperty("loc_pass"), "Skip");
		//CommonHelpers.explicitWait(driver, "//small[text()='Dashboard']//following-sibling::span");
		Thread.sleep(2000);
		CommonHelpers.clickOption(driver, property.getProperty("loc_dropdownbutton"));

	}
	
}
