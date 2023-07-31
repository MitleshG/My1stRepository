package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPasswordPage 
{
	@FindBy(xpath="//input[@id='ap_password']")private WebElement Password;
	@FindBy(xpath="//input[@id='signInSubmit']")private WebElement signInButton;
	
	public AmazonPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
     
	public void enterPassword()
	{
		Password.sendKeys("tajmahal04");
	}
	
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
	

}
