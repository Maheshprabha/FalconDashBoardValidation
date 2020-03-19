package com.atmecs.falcon.testscript;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.falcon.FilePath;
import com.atmecs.falcon.baseclass.BaseClass;
import com.atmecs.falcon.commonhelpers.CommonHelpers;
import com.atmecs.falcon.dataallcator.DataLocator;
import com.atmecs.falcon.dataallcator.ValidAllacator;
import com.atmecs.falcon.dataallcator.ValidLocator;
import com.atmecs.falcon.locationreader.ExcelReader;
import com.atmecs.falcon.locationreader.LocationReader;
import com.atmecs.falcon.pages.PageAction;
import com.atmecs.falcon.property.PropertyReader;

public class TestScipt extends BaseClass {

	Properties property;
	DataLocator path_name = new DataLocator();
	ValidAllacator valid_name = new ValidAllacator();
	PropertyReader reader = new PropertyReader();
	ValidLocator valid_path = new ValidLocator();
	LocationReader read = new LocationReader();
	PageAction valid_table = new PageAction();

	@Test
	public void action() throws Exception {
		path_name.getPathData();
		valid_name.getvalidData();
		valid_path.getPathValid();

		property = LocationReader.readLocation(FilePath.locator_path);
		CommonHelpers.clickAction(driver, property.getProperty("loc_dashboard"));
		CommonHelpers.clickAction(driver, property.getProperty("loc_restapi"));
		CommonHelpers.explicitWait(driver, property.getProperty("loc_falcon"));

		/* Filter by falcon */
		CommonHelpers.dropdown(driver, property.getProperty("loc_falcon"), "Falcon");
		PageAction.validateTable(driver, 0);
		Thread.sleep(1000);

		/* Filter by pass */
		CommonHelpers.dropdown(driver, property.getProperty("loc_createfalconpost"), "createFalconPosts");
		CommonHelpers.dropdown(driver, property.getProperty("loc_pass"), "Pass");
		Thread.sleep(1000);
		PageAction.validateTable(driver, 1);

		/* Filter by fail */
		CommonHelpers.dropdown(driver, property.getProperty("loc_pass"), "Fail");
		Thread.sleep(1000);
		PageAction.validateTable(driver, 2);

		/* Click dashboard */
		CommonHelpers.clickOption(driver, property.getProperty("loc_dropdownbutton"));

		/* Click download tooltip */
		CommonHelpers.clickAction(driver, property.getProperty("loc_downloadbutton"));
		// CommonHelpers.alertOperation(driver, "dismiss");

		/* Click test case icon */
		CommonHelpers.clickAction(driver, property.getProperty("loc_testcase"));
		Thread.sleep(2000);

		/* Click pass icon */
		CommonHelpers.clickAction(driver, property.getProperty("loc_passbutton"));
		Thread.sleep(2000);

		/* Click fail icon */
		CommonHelpers.clickAction(driver, property.getProperty("loc_failbutton"));
		Thread.sleep(2000);

		/* Click skip icon */
		CommonHelpers.clickAction(driver, property.getProperty("loc_skipbutton"));
		CommonHelpers.clickAction(driver, property.getProperty("loc_icon"));
        
		/* Validate the recent run table*/
		CommonHelpers.clickAction(driver, property.getProperty("loc_recentruns"));
		Thread.sleep(2000);
		PageAction.validateTables(driver, 3);
		
	}
		}
