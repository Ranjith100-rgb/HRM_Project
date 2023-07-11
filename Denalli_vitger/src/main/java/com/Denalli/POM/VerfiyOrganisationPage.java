package com.Denalli.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerfiyOrganisationPage 
{
		@FindBy(xpath="//span[@class='dvHeaderText']")
		private WebElement createdOrgisation;
		
		public VerfiyOrganisationPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getCreatedOrgisation() {
			return createdOrgisation;
		}
		
		public String verifyCreatedOrganisation() throws Throwable
		{
			Thread.sleep(3000);
			return createdOrgisation.getText();
		}
}
