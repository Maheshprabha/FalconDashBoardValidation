package com.atmecs.falcon.dataallcator;

import java.util.Properties;

import com.atmecs.falcon.FilePath;
import com.atmecs.falcon.locationreader.LocationReader;

public class DataLocator {
	Properties property;

	public String firstbutton;
	public String api;
	public String valid;
	public String imagevalidate;
	public String tooltip;
	public String bartip;
	public String doctip;
	public String overalltable;

	public void getPathData() throws Exception {
		property = LocationReader.readLocation(FilePath.locator_path);
		firstbutton = property.getProperty("loc_dashboard");
		api = property.getProperty("loc_aplelement");
		imagevalidate = property.getProperty("loc_imagevalid");
		tooltip = property.getProperty("loc_tooltip90%");
		bartip = property.getProperty("loc_bartooltip");
		doctip = property.getProperty("loc_doctooltip");
		overalltable = property.getProperty("loc_overalltable");
		

	}

}