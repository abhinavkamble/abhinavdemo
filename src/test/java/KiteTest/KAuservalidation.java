package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import KiteBase.BaseProp;
import KitePOM.KAhome;
import KitePOM.KAlogin;
import KitePOM.KApin;
import KiteUtility.KAutilityProp;

@Listeners (ListenersStudy.KAlistenersNew.class)
public class KAuservalidation extends BaseProp
{
	KAhome home;
	KAlogin login;
	KApin pin;
	//String TCID = "420";
	
	@Parameters("Browsername")
	@BeforeClass
	public void browser() throws IOException
	{
		
//		if(name.equals("chrome"))
//	    {
	       openChromeBrowser();
//	    }
//	    else if(name.equals("firefox"))
//	    {
//         openFirefoxBrowser();
//	    }
		
		home = new KAhome(driver);
		login = new KAlogin(driver);
		pin = new KApin(driver);
	    
	
	}
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
		login.sendKAuseId(KAutilityProp.Getdetafromproperty("UserId"));
		Reporter.log("userid entered Successfully",true);
		login.sendKAusePWD(KAutilityProp.Getdetafromproperty("UserPass"));
		Reporter.log("Password entered Successfully",true);
		login.ClickKALogin();
		Reporter.log("Login Successfully",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendKApin(KAutilityProp.Getdetafromproperty("UserPin"));
		Reporter.log("PIN entered Successfully",true);
		pin.ClickContinueButton();
		Reporter.log("HomePage Opened Successfully",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	@Test
	public void verifyUID() throws EncryptedDocumentException, IOException
	{
		
		Assert.assertEquals(home.actualKAusrname(), KAutilityProp.Getdetafromproperty("UserId"));
		Reporter.log("Actual userid and expected userid matching TC is PASSED",true);
		Assert.fail();
	    //KAutilityProp.CaptureScreenShot(driver, TCID);
	}
	@AfterMethod
	public void logout()
	{
		home.KAusernameClick();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		home.KAlogoutClick();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		Reporter.log("Logout Successfully",true);
		
	}
	@AfterClass
	public void Closebrowser()
	{
		driver.close();
		Reporter.log("Browser closed Successfully",true);
	}

}
