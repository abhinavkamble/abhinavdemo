package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.io.FileHandler;

import KiteBase.BaseProp;

public class KAutilityProp extends BaseProp
{
	public static String Getdetafromproperty(String key) throws IOException
	{
		Properties Obj = new Properties();
		FileInputStream myfile = new FileInputStream("C:\\Users\\Abhinav\\eclipse-workspace\\26MarchBmaven\\MyProperty.properties");
		Obj.load(myfile);
		String value = Obj.getProperty(key);
		return value;
	}
	public static void CaptureScreenShot() throws IOException
	{
		File SRC = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Desti = new File("E:\\Velocity\\Salenium Screenshot\\Heena.PNG");
		FileHandler.copy(SRC, Desti);

		
    }
	

}
