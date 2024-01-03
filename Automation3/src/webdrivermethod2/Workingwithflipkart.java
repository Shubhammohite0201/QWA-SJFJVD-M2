package webdrivermethod2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithflipkart {

	public static void main(String[] args) {
		 
		// to launch browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize browser
		driver.manage().window().maximize();
		
		// to launch web application
		driver.get("https://www.flipkart.com/");
		
		// to switch 
		driver.switchTo().activeElement().sendKeys("iphone", Keys.ENTER);
		
		// to fetch title
		String title = driver.getTitle();
		
		// to close
		 //driver.quit();
	}
}
