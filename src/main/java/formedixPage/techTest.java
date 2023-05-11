package formedixPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class techTest {
	WebDriver driver;
	public techTest(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".itemTitle")
	WebElement  medicalHistory;
	
	@FindBy(id="switchEditMode")
	WebElement editMode;
	
	@FindBy(id="expandDetailedPanel")
	WebElement expand;
	@FindBy(xpath="//textarea[@placeholder='Text']")
	WebElement descprition;
	
	@FindBy(id="saveAsset")
	WebElement save;
	@FindBy(id="formDescription")
	WebElement text;
	
	
	public Object addDescription(String data)
	{
		medicalHistory.click();
		editMode.click();
		expand.click();
		descprition.clear();
		descprition.sendKeys(data);
		save.click();
		String descr=text.getText();
		return descr;
		
	}


	


	
	
	
			
			

}
