package WrbdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwitchzomztoclosemetod {
	
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		 
		// to launch web application
		driver.get("https://www.zomato.com/india");
		
		// to close the browser
		driver.close();
		
	}

}
