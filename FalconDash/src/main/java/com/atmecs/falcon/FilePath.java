package com.atmecs.falcon;

import java.io.File;

public class FilePath {
	public final static long page_load_timeout = 30;
	public static final String User_Home = System.getProperty("user.dir") + File.separator;
	public static final String Driver_Path = "./Drivers/chromedriver.exe";
	public static final String Location_Reader = "./src/main/java/com/atmecs/falcon/locationreader/LocationReader.java";
	public static final String Config_Path = "./src/test/resources/config.property"; 
	public static final String locator_path = "./src/test/resources/Locators/Validlocator.properties";
	public static final String valid_path = "./src/test/resources/Locators/valid.properties";
	public static final String Dash_validpath = "./src/test/resources/testdata/dashboard.properties";
	public static final String Property_Reader = "./src/main/java/com/atmecs/falcon/property/PropertyReader.java";
	
}
