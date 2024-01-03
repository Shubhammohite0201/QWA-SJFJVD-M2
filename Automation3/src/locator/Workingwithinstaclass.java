package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithinstaclass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		// identify username
		driver.findElement(By.name("username")).sendKeys("shubham@gmil.com");
		
		// identify password
		driver.findElement(By.name("password")).sendKeys("29292929");
		
		//identify login
		driver.findElement(By.className("_acap")).click();
		
		
	    
	}

}
