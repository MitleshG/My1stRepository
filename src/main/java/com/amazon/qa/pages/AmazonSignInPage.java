package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignInPage 
{
	
	@FindBy(xpath="//label[@class='a-form-label']")private WebElement assetText;
	@FindBy(xpath="//input[@id='ap_email']")private WebElement EmailOrMobilePhoneNumber;
	@FindBy(xpath="//input[@id='continue']")private WebElement continueButton;
	

	public  AmazonSignInPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void EnterEmailOrMobilePhoneNumber()
	{
		EmailOrMobilePhoneNumber.sendKeys("mitleshgawatre@gmail.com");
	}
	public void clickonContinueButton()
	{
		continueButton.click();
	}
	public String AssetText()
	{
		String acttext=assetText.getText();
	    return acttext;
	}
}
