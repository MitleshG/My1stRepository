package com.amazon.qa.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.BaseClass;
import com.amazon.qa.pages.AmazonHomePage;
import com.amazon.qa.pages.AmazonPasswordPage;
import com.amazon.qa.pages.AmazonSerachPage;
import com.amazon.qa.pages.AmazonSignInPage;
import com.amazon.qa.util.Utility;

public class ValidateAmazonTestClass extends BaseClass 
{
   //  WebDriver driver;
     AmazonHomePage home;
     AmazonSignInPage signinpage;
     AmazonPasswordPage passwordpage;
     AmazonSerachPage sereachPage;
	@BeforeClass
	public void launchAmazon() throws InterruptedException
	{
		openApplication();
		home=new AmazonHomePage(driver);
		signinpage=new AmazonSignInPage(driver);
	passwordpage=new AmazonPasswordPage(driver);
	 sereachPage=new AmazonSerachPage(driver);
	 Thread.sleep(1000);
		home.movetoelement(driver);
	    Thread.sleep(1000);
		home.clickOnSignInButton();
	
	}
	
	@BeforeMethod
	public void loginToAmazon() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(1000);
		home.movetoelement(driver);
	    Thread.sleep(1000);
		home.clickOnSignInButton();
		
//	   String expText=Utility.readDataFromExcel(0, 1);
//	   String actText=signinpage.AssetText();
//	   Assert.assertEquals(expText,actText,"Text are not matching");
//   
		signinpage.EnterEmailOrMobilePhoneNumber();
		 Thread.sleep(1000);
		signinpage.clickonContinueButton();
		
		passwordpage.enterPassword();
		 Thread.sleep(1000);
		passwordpage.clickOnSignInButton();
		
//		sereachPage.EnterSearchTextbox();
//		sereachPage.clickOnsubmitbtn();
//		
//		Utility.JavaScriptExcutor(driver);
//		sereachPage.clickOnSamsungMobile();
//		
//		 Thread.sleep(1000);
//		Utility.windowHandles(driver);
//		Utility.JavaScriptExcutor(driver);
//		Thread.sleep(1000);
//		sereachPage.clickOnaddToCartbtn();
//		Thread.sleep(1000);
//		
//		sereachPage.clickCartbtn();
//	}
//	@Test
//	public void validateTestCase1() throws InterruptedException
//	{
//		 Thread.sleep(2000);
//		sereachPage.EnterSearchTextbox();
//		 Thread.sleep(2000);
//		sereachPage.clickOnsubmitbtn();
//		 Thread.sleep(2000);
//		Utility.JavaScriptExcutor(driver);
//		 Thread.sleep(2000);
//		sereachPage.clickOnSamsungMobile();
//		
//		 Thread.sleep(2000);
//		Utility.windowHandles(driver);
//
//		Thread.sleep(2000);
//		sereachPage.clickOnaddToCartbtn();
//		
//		Thread.sleep(2000);
//		
//		sereachPage.clickCartbtn();
//		 Thread.sleep(2000);
		
 }
	
	@Test
	public void validateTestCase2() throws InterruptedException
	{
		 Thread.sleep(2000);
		sereachPage.EnterSearchTextbox();
		 Thread.sleep(2000);
		sereachPage.clickOnsubmitbtn();
		 Thread.sleep(2000);
		
		Utility.JavaScriptExcutor(driver);
		 Thread.sleep(2000);
		sereachPage.clickOnSamsungMobile1();
		
		 Thread.sleep(2000);
		Utility.windowHandles(driver);
		 Thread.sleep(2000);
		Utility.JavaScriptExcutor(driver);
		Thread.sleep(2000);
		sereachPage.clickOnaddToCartbtn();
		Thread.sleep(2000);
		
		sereachPage.clickCartbtn();
		 Thread.sleep(2000);
	}
	
	@AfterMethod
	public void SignOutAmazon()
	{
		sereachPage.movetoelement2(driver);
		
		sereachPage.clickOnsignOutbutton2();
	}

}
