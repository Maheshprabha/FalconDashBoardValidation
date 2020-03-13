package com.atmecs.falcon.dataallcator;

import java.util.Properties;

import com.atmecs.falcon.FilePath;
import com.atmecs.falcon.locationreader.LocationReader;

public class ValidLocator {

	Properties property;

	public String expecttooltip;
	public String expectbartip;
    public String expectdoctip;
    
	public void getPathValid() throws Exception {
		property = LocationReader.readLocation(FilePath.Dash_validpath);
		expecttooltip= property.getProperty("passtip");
		expectbartip = property.getProperty("bartip");
		expectdoctip = property.getProperty("doctip");
		
	}

	
	}

