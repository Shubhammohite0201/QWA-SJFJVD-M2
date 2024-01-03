package webdrivermethod2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {

	public static void main(String[] args) {
		
		// to launch browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize browser
		driver.manage().window().maximize();
		
		// to launch web application
		driver.get("https://www.amazon.in/");
		
		// to navigate
		driver.navigate().to("https://www.swiggy.com/");
		
		//to back go
		driver.navigate().back();
		
	   // to forward 
		driver.navigate().forward();
		
		// to refresh
		driver.navigate().refresh();
		
		driver.quit();
		
	}
	
}
