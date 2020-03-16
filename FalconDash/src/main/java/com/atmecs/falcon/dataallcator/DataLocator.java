package com.atmecs.falcon.dataallcator;

import java.util.Properties;

import com.atmecs.falcon.FilePath;
import com.atmecs.falcon.locationreader.LocationReader;

public class DataLocator {
	static Properties property;

	public String firstbutton;
	public String restapi;
	public String tablevalue;
	public String deletetestcase;
	public String selectcustomer;
	public String downloadapiresult;
	public String exporttestcasename;
	public String getteastcasename;
	public String invalidtestcase;
	public String recenttestcase;
	public String reporttestcase;
	public String uploadtestcase;
	public String filetestcase;
	public String viewtestcase;
	public String dropdownfalcon;
	//public string selectcustomer;
	//public String falcon;
	/*
	 * public String api; public String valid; public String imagevalidate; public
	 * String tooltip; public String bartip; public String doctip; public String
	 * overalltable;
	 */

	public void getPathData() throws Exception {
		property = LocationReader.readLocation(FilePath.locator_path);
		property = LocationReader.readLocation(FilePath.Dash_validpath);
		firstbutton = property.getProperty("loc_dashboard");
		restapi =property.getProperty("loc_restapi");
		tablevalue=property.getProperty("loc_tableelement");
		deletetestcase=property.getProperty("testcasename");
		downloadapiresult=property.getProperty("imagetestcasename");
		exporttestcasename=property.getProperty("exporttestcasename");
		getteastcasename=property.getProperty("getteastcasename");
		invalidtestcase=property.getProperty("invalidtestcase");
		recenttestcase=property.getProperty("recenttestcase");
		reporttestcase=property.getProperty("reporttestcase");
		uploadtestcase=property.getProperty("uploadtestcase");
		filetestcase=property.getProperty("filetestcase");
		viewtestcase=property.getProperty("viewtestcase");
		dropdownfalcon=property.getProperty("");
		
		
		
		
		
		//dropdownfalcon=property.getProperty("loc_dropdownfalcon");
		//selectcustomer=property.getProperty("loc_selectcustomer");
		//falcon=property
		/*
		 * api = property.getProperty("loc_aplelement"); imagevalidate =
		 * property.getProperty("loc_imagevalid"); tooltip =
		 * property.getProperty("loc_tooltip90%"); bartip =
		 * property.getProperty("loc_bartooltip"); doctip =
		 * property.getProperty("loc_doctooltip"); overalltable =
		 * property.getProperty("loc_overalltable");
		 */

	}

	
}