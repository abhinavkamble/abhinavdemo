package KiteBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import KiteUtility.KAutilityProp;


public class BaseProp 
{
	protected static WebDriver driver;
	public void openFirefoxBrowser() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Java Selenium 4.1.4\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get(KAutilityProp.Getdetafromproperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("Browser was launched Successfully",true);
		ChromeOptions co = new ChromeOptions();
		co.addArguments("disable-popup-blocking");  
   }
	public void openChromeBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java Selenium 4.1.4\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(KAutilityProp.Getdetafromproperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("Browser was launched Successfully",true);
		ChromeOptions co = new ChromeOptions();
		co.addArguments("disable-popup-blocking");  
	}  
}


