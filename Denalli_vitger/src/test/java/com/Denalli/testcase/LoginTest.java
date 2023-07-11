package com.Denalli.testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.Denalli.POM.LoginPage;
import com.genricUtility.FileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{	
	
	@Test
	public void testCase() throws Throwable
	{
	FileUtility fLib=new FileUtility();
	String EnvConfigData = fLib.getFilePath("projectEnvConfigData");
	
	 String BROWSER = fLib.getEnvconfigData(EnvConfigData, "browser");
	 String URL = fLib.getEnvconfigData(EnvConfigData, "url");
	 String USERNAME = fLib.getEnvconfigData(EnvConfigData, "username");
	 String PASSWORD = fLib.getEnvconfigData(EnvConfigData, "password");
	 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(URL);
	 LoginPage lp=new LoginPage(driver);
	 lp.LoginToApp(USERNAME, PASSWORD);
	 
	 
	 
	
	
	
	}

	
	
}
