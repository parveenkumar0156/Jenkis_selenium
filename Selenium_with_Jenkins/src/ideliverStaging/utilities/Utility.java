package ideliverStaging.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	public static Object fetchProperty(String key) throws IOException{
		//making connection with input file from where we will read data
		FileInputStream file=new FileInputStream("./config/config.properties");
		Properties property=new Properties();
		property.load(file);
		return property.get(key);
				
	}
	public static String fetchlocatorValue(String key) throws IOException{
		//making connection with input file from where we will read data
		FileInputStream file=new FileInputStream("./config/elements.properties");
		Properties property=new Properties();
		property.load(file);
		return property.get(key).toString();
				
	}
}
