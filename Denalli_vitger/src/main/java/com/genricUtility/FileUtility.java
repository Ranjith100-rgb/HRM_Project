package com.genricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility 

{
		public String getFilePath(String key) throws Throwable
		{
		FileInputStream fis=new FileInputStream("./config/FilePath.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String value = pObj.getProperty(key);
		return value;
		}
		
		public String getEnvconfigData(String filePath, String key) throws Throwable
		{
			FileInputStream fis=new FileInputStream(filePath);
			Properties pObj=new Properties();
			pObj.load(fis);
			String value = pObj.getProperty(key);
			return value;
		}
}
