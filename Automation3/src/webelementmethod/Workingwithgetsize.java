package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithgetsize {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
	WebElement name =	driver.findElement(By.name("Email"));
	
	Dimension size = name.getSize();
	
	System.out.println(size);
}
	
	
	

}
