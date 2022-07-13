package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KApin 
{
	@FindBy (id = "pin")private WebElement UserPIN;
	@FindBy (xpath = "//button[@type='submit']")private WebElement ContinueButton;
	
	public KApin (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendKApin(String KApin)
	{
		UserPIN.sendKeys(KApin);
	}
	
	public void ClickContinueButton()
	{
		ContinueButton.click();
	}

}
