package com.amazon.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Utility 
{
	
	public static void imlicitWait(WebDriver driver,int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}
    
	public static void JavaScriptExcutor(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "");
	}
	
	public static void windowHandles(WebDriver driver)
	{
//		Set<String> ids=driver.getWindowHandles();
//		ArrayList<String> id=new ArrayList<String>(ids);
//		   
//		   String child=id.get(1);
//		   driver.switchTo().window(child);	
		
		      Set<String> wnd = driver.getWindowHandles();
		    
		      Iterator<String> i = wnd.iterator();
		      String prntw = i.next();
		      String popwnd = i.next();
		      
		      driver.switchTo().window(popwnd);
		    		
	}
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		String a=System.getProperty("user.dir");
		String b="\\ExcelSheet\\AmazonData.xlsx";
		 FileInputStream file=new FileInputStream(a+"/"+b);
		 String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		 
		 return value;
		 	 
	}
}
