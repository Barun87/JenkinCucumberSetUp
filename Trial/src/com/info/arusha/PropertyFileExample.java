package com.info.arusha;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyFileExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream(new File("C:/Workspace/Trial/PropertyFileExample.properties"));
		Properties pr=new Properties();
		pr.load(fi);
		fi.close();
	Enumeration en=pr.keys();
	while(en.hasMoreElements())
	{
		String key=(String) en.nextElement();
	String value=pr.getProperty(key);
	System.out.println(key + ": " + value);
	
	
		
		
		
	}
		
		

	}

}
