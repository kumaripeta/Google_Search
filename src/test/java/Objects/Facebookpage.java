package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookpage {

	WebDriver driver;
	public Facebookpage (WebDriver driver) {
		this.driver=driver;
	
	}
   By Username_editbox=By.xpath("//*[@id=\"email\"]");
   By password_editbox=By.xpath("//*[@id=\"pass\"]");
   By Login_Btn=By.name("login");
 
   
   
   public void EnterUsername()
   {
	   driver.findElement(Username_editbox).clear();
	   driver.findElement(Username_editbox).sendKeys("kumaripeta1998@gmail.com");
   }
	
   public void EnterPassword()
   {
	   driver.findElement(Username_editbox).clear();																																																					
	   driver.findElement(password_editbox).sendKeys("Kumari@12345");
   }
	
   public void VerifyLogin()
   {
	   driver.findElement(Login_Btn).click();
	   String title=driver.getTitle();
	   assertEquals(title,"Log in to Facebook");
   }
	
}
 