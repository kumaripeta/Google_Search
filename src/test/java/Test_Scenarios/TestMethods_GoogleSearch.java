package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.Facebookpage;
import Objects.GoogleSearchpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
	WebDriver driver;
	Facebookpage objectrepo2;
	GoogleSearchpage objectrepo;
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	@Test(priority=0)
	public void SearchOperation() throws InterruptedException {
		GoogleSearchpage page= new GoogleSearchpage(driver);
		page.searchgoogle("facebook");
		
	}
	@Test(priority=1)
	public void VerifyandAccessFacebook() {
	
		objectrepo= new GoogleSearchpage(driver);
		objectrepo.ClickFacebook();
	}
	@Test(priority=2)
	
	public void VerifyLoginfunctionality()throws InterruptedException {
		objectrepo2 =new Facebookpage(driver);
		objectrepo2.EnterUsername(); 
		objectrepo2.EnterPassword();
	    objectrepo2.VerifyLogin();
	    
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	
	}

