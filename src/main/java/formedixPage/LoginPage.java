package formedixPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement passWord;
	
	@FindBy(id="btnSubmit")
	WebElement submit;
	
	public void loginApplication(String username,String password)
	{
		userName.sendKeys(username);
		passWord.sendKeys(password);
		submit.click();
	}
	
	public void goTo()
	{
		driver.get("https://ryze-staging.formedix.com/sign-in");
	}
	

}
