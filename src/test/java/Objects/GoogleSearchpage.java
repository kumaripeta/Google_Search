package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpage {
	
	WebDriver driver;
	public GoogleSearchpage (WebDriver driver) {
		this.driver=driver;
	
	}
   By searchbox= By.xpath("//*[@id=\"APjFqb\"]");
   By searchbtn=By.name("btnK");
   By facebook_link=By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div/div[1]/div");
   public void searchgoogle(String Searchinput)
   {
   try
   {
	   driver.findElement(searchbox).sendKeys(Searchinput);
	   Thread.sleep(1000);

	   driver.findElement(searchbtn).click();
	   Thread.sleep(1000);
   }
   catch(Exception e)
   {
	   System.out.println("Exeption caught"+ e.getMessage());
   }
   }
   public void ClickFacebook() {  
	   try
	   {
		   driver.findElement(facebook_link).click();
		  Thread.sleep(1000);
		  
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exeption caught"+ e.getMessage());
	   }
	   
   }
   
   
   
   
}
   
   

