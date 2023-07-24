package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class filpkart {
  @Test
  public void filpkartTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.close();
		Thread.sleep(3000);
		
		
		System.out.println("Hi GE");
		System.out.println("mit");
  }
}
