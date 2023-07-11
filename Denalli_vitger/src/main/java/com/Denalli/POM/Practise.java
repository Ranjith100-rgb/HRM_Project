package com.Denalli.POM;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.genricUtility.FileUtility;

public class Practise 
{
	
	FileUtility fLib=new FileUtility();
	int TimeOut;
	public Practise() throws Throwable
	{
		String EnvirConfi = fLib.getFilePath("./config/EnvConfigData.properties");
		String STimeOut = fLib.getEnvconfigData(EnvirConfi, "TimeOut");
		TimeOut = Integer.parseInt(STimeOut);
	}
	
	public void switchToWindow(WebDriver driver, String partialTitle)
	{
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String wID = it.next();
			driver.switchTo().window(wID);
			String currentTitle = driver.getTitle();
			if(currentTitle.contains(partialTitle))
			{
				System.out.println(partialTitle+"switch to window");
				break;
			}
		}
	}
	
	public void waitForElementInDOM(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
	}
	
	public void waitForElementToBevisible(WebDriver driver,WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,TimeOut);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void waitForPage(WebDriver driver,String partialURL)
	{
		WebDriverWait wait=new WebDriverWait(driver,TimeOut);
		wait.until(ExpectedConditions.urlContains(partialURL));
	}
	

}
