package assginmnent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithxpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		 

		
		driver.get("https://www.airvistara.com/");
		
	 WebElement cookies =  driver.findElement(By.xpath(" //button[contains(text(),' Accept All')]"));cookies.click();
		
		
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("PNQ");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("DEL");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='28']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='30']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
		
		
		
		

		
		
		 
		
		
	}

}
