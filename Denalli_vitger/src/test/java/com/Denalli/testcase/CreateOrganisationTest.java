package com.Denalli.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Denalli.POM.HomePage;
import com.Denalli.POM.LoginPage;
import com.Denalli.POM.OrganisationPage;
import com.genricUtility.ExcelUtility;
import com.genricUtility.FileUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganisationTest 
{
		@Test
		public void testCase3() throws Throwable
		{
			FileUtility fLib=new FileUtility();
			String EnvConfigData = fLib.getFilePath("projectEnvConfigData");
			
			 String BROWSER = fLib.getEnvconfigData(EnvConfigData, "browser");
			 String URL = fLib.getEnvconfigData(EnvConfigData, "url");
			 String USERNAME = fLib.getEnvconfigData(EnvConfigData, "username");
			 String PASSWORD = fLib.getEnvconfigData(EnvConfigData, "password");
			 
			 String ExcelPath = fLib.getFilePath("testScriptData");
			 ExcelUtility eLib=new ExcelUtility();
			 String ORGNAME = eLib.getExcelDataFromProperty(ExcelPath, "Sheet1", "tc_01", "organizationName");
			 
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get(URL);
			 //login to application
			 LoginPage lp=new LoginPage(driver);
			 lp.LoginToApp(USERNAME, PASSWORD);
			 
			 //click on organisation 
			 HomePage hp=new HomePage(driver);
			 hp.clickOnOrganizationLookUp();
			 
			 //create organisation and save
			 OrganisationPage organisationpage=new OrganisationPage(driver);
			 organisationpage.createOrganisationAndSave(ORGNAME);
		}
}
