package com.atmecs.falcon.dataallcator;

import java.util.Properties;

import com.atmecs.falcon.FilePath;
import com.atmecs.falcon.locationreader.LocationReader;

public class ValidAllacator {
	Properties property;

	public String valid;
	//public String imagevalid;

	public void getvalidData() throws Exception {
		property = LocationReader.readLocation(FilePath.valid_path);
		valid=property.getProperty("valid_data");
		//imagevalid=property.getProperty("Valid_image");
		
}
}