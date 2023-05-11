package standaloneDependices;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.HashSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import formedixPage.LoginPage;
import formedixPage.logOut;
import formedixPage.studies;
import formedixPage.techTest;

public class Standalone {

	
	@Test
	public void submitTest()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		HashSet<String>hs=new HashSet<String>();
		HashSet<String>hs1=new HashSet<String>();
	   //Login Scenario
		LoginPage lp=new LoginPage(driver);
		
		lp.goTo();
		
		lp.loginApplication("testteamtechtest","Ryz3T3st!x");
		//Repositories
		studies st=new studies(driver);
		st.repository();
		//2a. Confirm the options on the ‘Tech Study’ menu 
		hs.add("View ");
		hs.add("Edit ");
		hs.add("Remove this study ");
		hs.add("Transition this study ");
		st.verifyDropdown(hs1);
		assertTrue(hs.equals(hs1));
		st.fieldsClick();
//		//3.User Actions
		techTest tech=new techTest(driver);
		String s="New User";
		assertTrue(s.equals(tech.addDescription(s)));
//		//4.Logout
		logOut lo=new logOut(driver);
		lo.signoutApplication();
		driver.close();
	}
		
	
}

	
	

