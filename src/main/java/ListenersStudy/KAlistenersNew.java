package ListenersStudy;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteUtility.KAutilityProp;

public class KAlistenersNew extends KAutilityProp implements ITestListener
{
	
	
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC is passed,Passed TC Name is --"+result.getName(),true);
		
	}
	
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("TC is Failed ScreenShot is Taken,Failed TC Name is --"+result.getName(),true);
		try {
			CaptureScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
