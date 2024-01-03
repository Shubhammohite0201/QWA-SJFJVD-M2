package WrbdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithnavigatemethod {
	
	public static void main(String[] args) {
		
		//to launch browser
		WebDriver driver = new ChromeDriver();
				
		// to maximize the browser
		driver.manage().window().maximize();
				
		// to launch web application
		driver.get("https://www.zomato.com/india");
		
		//to navigate application
		driver.navigate().to("https://www.swiggy.com/");
		
		// to go back
		driver.navigate().back();
		
		// to forward
		driver.navigate().forward();
		
		//to refresh
		driver.navigate().refresh();
		
		driver.quit();
				
	}

}
