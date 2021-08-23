package com.pms.commonutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fileutility 
{
	/*
	 *This getPropertyKeyvalue method used to get the data  from the property file based upon key
	*/
	public String getPropertyKeyValue(String key) throws IOException
	{
	   FileInputStream file = new FileInputStream(IConstant.Commondatafilepath);
	   Properties property = new Properties();
	   property.load(file);
	   String value = property.getProperty(key);
	   return value;
	   
	}
	
}
