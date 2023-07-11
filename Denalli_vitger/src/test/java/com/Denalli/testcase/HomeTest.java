package com.Denalli.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Denalli.POM.HomePage;
import com.Denalli.POM.LoginPage;
import com.genricUtility.FileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeTest {

	@Test
	public void testCase2() throws Throwable
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
		 
		 //login functionality
		 LoginPage lp=new LoginPage(driver);
		 lp.LoginToApp(USERNAME, PASSWORD);
		 
		 //Homepage functionality
		 HomePage hp=new HomePage(driver);
		 hp.clickOnOrganizationLookUp();
		 
		 
	}
	
}
