package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSerachPage
{

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement searchtextbox;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")private WebElement submitbtn;
	@FindBy(xpath="//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-5\"]//descendant::div[@class=\"a-section a-spacing-none puis-padding-right-small s-title-instructions-style\"]")
	private WebElement samsungmobile;
	@FindBy(xpath="//span[text()='Samsung Galaxy M34 5G (Midnight Blue, 6GB, 128GB Storage) | 120Hz sAMOLED Display | 50MP Triple No Shake Cam | 6000 mAh Battery | 12GB RAM with RAM Plus | Android 13 | Without Charger']")
	private WebElement samsungmobile1;
	@FindBy(xpath="//input[@id=\"add-to-cart-button\"]")private WebElement addToCartbtn;
	@FindBy(xpath="//span[@id='attach-sidesheet-view-cart-button-announce']")private WebElement Cartbtn;
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")private WebElement signOutbutton1;
	@FindBy(xpath="//span[text()='Sign Out']")private WebElement signOutbutton2;
	public AmazonSerachPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
     public void EnterSearchTextbox()
     {
    	 searchtextbox.sendKeys("samsung m32 128gb mobile");
     }
     
     public void clickOnsubmitbtn()
     {
    	 submitbtn.click();
     }
     public void clickOnSamsungMobile()
     {
    	 samsungmobile.click();
     }
     
     public void clickOnSamsungMobile1()
     {
    	 samsungmobile1.click();
     }
     
     public void clickOnaddToCartbtn()
     {
    	 addToCartbtn.click();
     }
     public void clickCartbtn()
     {
    	 Cartbtn.click();
     }
     public void movetoelement2(WebDriver driver)
 	{
 		Actions act=new Actions(driver);
 		act.moveToElement(signOutbutton1).perform();;
 	}
     public void clickOnsignOutbutton2()
     {
    	 signOutbutton2.click();
     }
}
