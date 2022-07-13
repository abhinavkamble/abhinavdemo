package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KAhome 
{
	//findout element
	@FindBy (xpath = "//span[text()='KV1672']")private WebElement UserName;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogoutButton;

	//constructor use
	public KAhome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods 
	public String actualKAusrname()
	{
		String ActualUserName = UserName.getText();
		return ActualUserName;
	}
	public void KAusernameClick()
	{
		UserName.click();
	}
	
	public void KAlogoutClick()
	{
		LogoutButton.click();
	}
}
