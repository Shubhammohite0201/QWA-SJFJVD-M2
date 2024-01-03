
package assginmnent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQspScript {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		
		driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("shubhu");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shubh2929");
		
		driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("shubhu2929");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shubhu2929@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='url']")).sendKeys("https//www.mohite.com");
		
		driver.findElement(By.xpath("//input[@name='digits']")).sendKeys("1,2,3,4");
		
		driver.findElement(By.xpath("//input[@name='number']")).sendKeys("9763660201");
		
		driver.findElement(By.xpath("//input[@name='alphanum']")).sendKeys("shubhu@29");
		
		driver.findElement(By.xpath("//input[@name='minLength']")).sendKeys("pavanmanu");
		
		driver.findElement(By.xpath("//input[@name='maxLength']")).sendKeys("bhaiya");
		
		driver.findElement(By.xpath("//input[@name='rangeLength']")).sendKeys("shivaji");
		
		driver.findElement(By.xpath("//input[@name='minValue']")).sendKeys("8");
		
		driver.findElement(By.xpath("//input[@name='maxValue']")).sendKeys("4");
		
		driver.findElement(By.xpath("//input[@name='rangeValue']")).sendKeys("29");
		
         WebElement   submitbutton =  driver.findElement(By.xpath("//button[@type='submit']"));
   
         submitbutton.submit();
				
	}

}
