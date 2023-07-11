package com.Denalli.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText="Organizations")
	private WebElement orginationLink;
	
	@FindBy(linkText="Contacts")
	private WebElement contactLink;
	
	@FindBy(linkText="Products")
	private WebElement productsLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement signOutButton;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrginationLink() {
		return orginationLink;
	}

	public WebElement getContactLInk() {
		return contactLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getSignOutButton() {
		return signOutButton;
	}
	
	public void clickOnOrganizationLookUp()
	{
		orginationLink.click();
	}
	
	public void clickOnContactLookUp()
	{
		contactLink.click();
	}
	
	public void clickOnProductLookUp()
	{
		productsLink.click();
	}
	
	public void signOut()
	{
		signOutButton.click();
	}


}
