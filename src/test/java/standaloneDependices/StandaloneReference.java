//package standaloneDependices;
//
//import static org.testng.Assert.assertTrue;
//
//import java.time.Duration;
//import java.util.HashSet;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class StandaloneReference {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		WebDriver driver=new ChromeDriver();
//		HashSet<String>hs=new HashSet<String>();
//		HashSet<String>hs1=new HashSet<String>();
//		//Fetching url
//		driver.get("https://ryze-staging.formedix.com/sign-in ");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().window().maximize();
//		//Login Scenario
//		driver.findElement(By.id("username")).sendKeys("testteamtechtest");
//		driver.findElement(By.id("password")).sendKeys("Ryz3T3st!x");
//		driver.findElement(By.id("btnSubmit")).click();
//		//wait for elemnt to be visible
//		
//		//Navigate to ‘Repository-&gt;Studies’
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='menuMdb']/fdx-main-nav-item/div/p[1]")));
//		element.click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menuMdbStudies")));
//		driver.findElement(By.id("menuMdbStudies")).click();
//		//2a. Confirm the options on the ‘Tech Study’ menu 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fdxMdbContainerListItem0MenuToggle")));
//		driver.findElement(By.id("fdxMdbContainerListItem0MenuToggle")).click();
//		hs.add("View");
////		hs.add("Edit");
//		hs.add("Remove this study");
//		hs.add("Transition this study");
//		List<WebElement>dropdown=driver.findElements(By.xpath("//*[@class='dropdown-menu']/li"));
//		for(WebElement dp:dropdown)
//		{
//			hs1.add(dp.getText());
//			
//		}
//		assertTrue(hs.equals(hs1));
//	
//	//b. Enter the tech test study view.
//		driver.findElement(By.id("fdxMdbContainerListItem0Name")).click();
//	//c. Enter the ‘Data acquisition’ asset group view.
//	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dataAcquisitionName")));
//		driver.findElement(By.id("dataAcquisitionName")).click();
//	//d. Select to view ‘Forms’.
//	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FORMTypeName")));
//		driver.findElement(By.id("FORMTypeName")).click();
//		
//		//3.1Select to view the ‘Medical History’ form.
//		driver.findElement(By.cssSelector(".itemTitle")).click();
//		//b. Select to edit the form by adding a ‘Description’ property to the form.
//		driver.findElement(By.id("switchEditMode")).click();
//		driver.findElement(By.id("expandDetailedPanel")).click();
//		driver.findElement(By.xpath("//textarea[@placeholder='Text']")).clear();
//		String s="yuuncluded";
//		driver.findElement(By.xpath("//textarea[@placeholder='Text']")).sendKeys(s);
//		
//	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='assetLocaleEditTextTextareadescriptionen']")));
//		//driver.findElement(By.xpath("//textarea[@id='assetLocaleEditTextTextareadescriptionen']")).sendKeys("s");
//		
//		//c. Save the change.
//		driver.findElement(By.id("saveAsset")).click();
//		//d. Confirm the user update has been preserved on the property panel,
//		//and on the main form view.
//		String descr=driver.findElement(By.id("formDescription")).getText();
//		assertTrue(s.equals(descr));
//		//4.Logout
//		
//		driver.findElement(By.xpath("//*[text()='testteamtechtest']")).click();
//		driver.findElement(By.xpath("//*[text()='Sign out']")).click();
//		driver.close();
//}
//
//	
//	
//}
