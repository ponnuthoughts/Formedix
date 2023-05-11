package formedixPage.abstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstractComponent {
	WebDriver driver;
	public abstractComponent(WebDriver driver)
	{
		this.driver=driver;
	}
	


public void elementVisible(By findBy)
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	
}
	
}
