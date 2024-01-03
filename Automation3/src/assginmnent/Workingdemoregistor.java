package assginmnent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingdemoregistor {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		
		//first name identify
		driver.findElement(By.id("FirstName")).sendKeys("shubham");
		
		//last name identify
	    driver.findElement(By.id("LastName")).sendKeys("mohite");
	    
	    // email identify
	    driver.findElement(By.id("Email")).sendKeys("shubham29@gmail.com");
	    
	    //password identify
	    driver.findElement(By.id("Password")).sendKeys("shubhu2929");
	    
	    //confirm password 
	    driver.findElement(By.id("ConfirmPassword")).sendKeys("shubhu2929");
	    
	    //register 
	    driver.findElement(By.name("register-button")).click();
				
		

			
		
		
	}

}
