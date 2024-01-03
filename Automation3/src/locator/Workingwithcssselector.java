package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithcssselector {
	
	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		// identify username with css selector
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		
		// identify password with css selector
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("Admin123");
		
		
		
		
	}

}
