package com.atmecs.falcon.testscript;

import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.falcon.baseclass.BaseClass;
import com.atmecs.falcon.commonhelpers.CommonHelpers;
import com.atmecs.falcon.dataallcator.DataLocator;
import com.atmecs.falcon.dataallcator.ValidAllacator;
import com.atmecs.falcon.dataallcator.ValidLocator;
import com.atmecs.falcon.property.PropertyReader;

public class TestScipt extends BaseClass {

	Properties property;
	DataLocator path_name = new DataLocator();
	ValidAllacator valid_name = new ValidAllacator();
	PropertyReader reader = new PropertyReader();
	ValidLocator valid_path = new ValidLocator();

	@Test
	public void action() throws Exception {
		path_name.getPathData();
		valid_name.getvalidData();
		valid_path.getPathValid();

		CommonHelpers.clickAction(driver, path_name.firstbutton);
		CommonHelpers.validate(driver, CommonHelpers.findElement(driver, path_name.api), valid_name.valid);
		CommonHelpers.imageValidation(driver, path_name.imagevalidate);
		CommonHelpers.validateAttribute(driver, path_name.tooltip, "uib-tooltip", valid_path.expecttooltip);
		CommonHelpers.validateAttribute(driver, path_name.bartip, "uib-tooltip", valid_path.expectbartip);
		CommonHelpers.validateAttribute(driver, path_name.doctip, "uib-tooltip", valid_path.expectdoctip);
		CommonHelpers.getValueText(driver, path_name.overalltable, "Dash_validpath", "restapi");
	

	}
}
