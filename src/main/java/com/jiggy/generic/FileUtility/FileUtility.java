package com.jiggy.generic.FileUtility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {


   public String getDataFromPropertiesFile(String key) throws IOException {
				
	   FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\JIGGY_PUZZLE\\src\\test\\resources\\commondata.properties\\commondata.properties");
	   Properties pobj = new Properties();
	   pobj.load(fis);
	   String data = pobj.getProperty(key);
	   return data;
				
			}
	

}
