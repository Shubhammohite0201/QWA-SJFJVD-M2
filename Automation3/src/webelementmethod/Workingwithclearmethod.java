package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithclearmethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
	WebElement name =	driver.findElement(By.name("Email"));
	
	name.sendKeys("shubhu12@gmail.com");
	
	Thread.sleep(2000);
	
	name.clear();
	
	name.sendKeys("shubham21@gmail.com");
	 	
	 	
		
		
		
	}

}
