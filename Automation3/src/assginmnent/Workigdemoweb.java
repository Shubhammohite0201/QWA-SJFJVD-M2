package assginmnent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workigdemoweb {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		// identify login
		driver.findElement(By.id("Email")).sendKeys("shubham29@gmail.com");
		
		// identify password
		driver.findElement(By.id("Password")).sendKeys("shubhu2929");
		
		// login 
		driver.findElement(By.className("login-button")).click();
	}

}
