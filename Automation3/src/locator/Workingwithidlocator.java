package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithidlocator {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//identify the username textfield amd perform any action
	    driver.findElement(By.id("email")).sendKeys("shubhamv@gmail.com");
	   
	  //identify the password text field and perform any action
	    driver.findElement(By.id("pass")).sendKeys("shubhu2929");
	    
	    // identify login
	    driver.findElement(By.name("login")).click();
	    
	    
	    
	 
	}
	
	
	

}
