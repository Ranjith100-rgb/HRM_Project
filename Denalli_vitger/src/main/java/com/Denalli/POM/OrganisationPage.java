package com.Denalli.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage 
{
	@FindBy(xpath="//img[@alt=\"Create Organization...\"]")
	private WebElement createOrganisationButton;
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement organisationTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public OrganisationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateOrganisationButton() {
		return createOrganisationButton;
	}

	public WebElement getOrganisationTextField() {
		return organisationTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	//Bussiness logic
	public void createOrganisationAndSave(String OrganisationName)
	{
		createOrganisationButton.click();
		organisationTextField.sendKeys(OrganisationName);
		saveButton.click();
	}

}
