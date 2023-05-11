package formedixPage;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import formedixPage.abstractComponents.abstractComponent;

public class studies extends abstractComponent{
	
	WebDriver driver;
	public studies(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	By element=By.xpath("//*[@id='menuMdb']/fdx-main-nav-item/div/p[1]");
	
	@FindBy(xpath="//*[@id='menuMdb']/fdx-main-nav-item/div/p[1]")
	WebElement repository;
	
	@FindBy(id="menuMdbStudies")
	WebElement studies;
	By id=By.id("menuMdbStudies");
	
	
	By id1=By.id("fdxMdbContainerListItem0MenuToggle");
	
	
	@FindBy(id="fdxMdbContainerListItem0MenuToggle")
	WebElement menu;
	
	@FindBy(xpath="//*[@class='dropdown-menu']/li")
	List<WebElement>  dropdown;
	
	@FindBy(id="fdxMdbContainerListItem0Name")
	WebElement testStudy;
	
	@FindBy(id="dataAcquisitionName")
	WebElement dataAcquisition;
	@FindBy(id="FORMTypeName")
	WebElement forms;
	
	public void repository()
	{
		
		elementVisible(element);
		repository.click();
		elementVisible(id);
		studies.click();
		
	}
	public HashSet<String> verifyDropdown(HashSet<String>hs1)
	{
		elementVisible(id1);
		menu.click();
		for(WebElement dp:dropdown)
		{
			hs1.add(dp.getText());
			
		}
		return hs1;
		
	}
	
	
	public void fieldsClick()
	{
		//b. Enter the tech test study view.
		testStudy.click();
		//c. Enter the ‘Data acquisition’ asset group view.
		dataAcquisition.click();
		//d. Select to view ‘Forms’.
		forms.click();
	}
	
	
		

}
