package assignment1.mavenn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Basic {
	
	
	 public WebDriver driver;
	
	//Test case for chrome.
	@Test
	public void chrome()
	{
		System.setProperty("webdriver.chrome.driver",".//driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	//Test case for firefox
//	@Test
//	public void gecko()
//	{
//		System.setProperty("webdriver.gecko.driver",".//driver//geckodriver.exe");
//		driver=new FirefoxDriver();
//	}
	
	//Test case for edge.
	@Test
	public void edge()
	{
		System.setProperty("webdriver.edge.driver",".//driver//msedgedriver.exe");
		driver=new EdgeDriver();
	}
	
	
	//Acccessing facebook url and validating title.
	@AfterMethod
	public void main()
	{
		driver.get("https://www.facebook.com");
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
		driver.close();
	}

}
