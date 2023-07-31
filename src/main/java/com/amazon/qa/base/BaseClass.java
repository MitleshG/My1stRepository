package com.amazon.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import org.testng.Reporter;
import com.amazon.qa.util.Utility;

public class BaseClass 
{
	
	public WebDriver driver;
	
	public void openApplication() throws InterruptedException
	{
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashis\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//				ChromeOptions co = new ChromeOptions();
//				co.setBinary("C:\\Users\\ashis\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");//115 chrome tested|
	          driver=new ChromeDriver();
	          driver.manage().window().maximize();
	          driver.get("https://www.amazon.in/");
	          
	          Utility.imlicitWait(driver, 1000);
	          
   //       Reporter.log("opening browser",true);
	          			
	}
	public void closeApplication()
	{
		 //   Reporter.log("closeing browser",true);
		//driver.close();
        
		
	}

}
