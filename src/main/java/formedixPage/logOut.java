package formedixPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOut {
	WebDriver driver;
	public logOut(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(xpath="//*[text()='testteamtechtest']")
	WebElement testteam;
	
	@FindBy(xpath="//*[text()='Sign out']")
	WebElement signout;
	
	public void signoutApplication()
	{
		testteam.click();
		signout.click();
	}
	
}
