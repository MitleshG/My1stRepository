package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage 
{
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")private WebElement signInbutton1;
	@FindBy(xpath="//div[@id='nav-al-signin']//descendant::span")private WebElement signInbutton2;
	
	public AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
     
	public void movetoelement(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(signInbutton1).perform();;
	}
	
	public void clickOnSignInButton()
	{
		signInbutton2.click();	
	}
}
