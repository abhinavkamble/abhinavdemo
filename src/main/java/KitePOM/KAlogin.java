package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KAlogin 
{
	// 1.data members     //find by is an annotation
		@FindBy (id = "userid")private WebElement UserName;
		@FindBy (id = "password")private WebElement Password;
		@FindBy (xpath = "//button[@type='submit']")private WebElement LoginButton;
		
		//2.Constructor
		public KAlogin(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3. methods
		public void sendKAuseId(String KAUID)
		{
			UserName.sendKeys(KAUID);
		}
		public void sendKAusePWD(String KAPWD)
		{
			Password.sendKeys(KAPWD);
		}
		public void ClickKALogin()
		{
			LoginButton.click();
		}

}
