package assginmnent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperstckScript {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/user-signin");
		
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("mohites768@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Shubhu@2929");
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		driver.findElement(By.xpath("//a[@name='men']")).click();
	}

}
