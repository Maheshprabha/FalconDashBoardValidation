package com.atmecs.falcon.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	public Properties propertyFile = new Properties();
	
	public String propertyRead(String path, String elements) {
		String data = null;
		propertyFile = new Properties();
		FileInputStream reader = null;
		try {
			reader = new FileInputStream(path);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		try {
			propertyFile.load(reader);
			data = propertyFile.getProperty(elements);

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return data;
	}

}
