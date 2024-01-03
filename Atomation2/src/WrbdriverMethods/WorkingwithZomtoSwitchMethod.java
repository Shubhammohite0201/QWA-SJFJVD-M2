package WrbdriverMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithZomtoSwitchMethod {
	
	public static void main(String[] args) {
		
		        //to launch the browser
				WebDriver driver = new ChromeDriver();
				
				// to maximize the browser
				driver.manage().window().maximize();
				
				// to launch web application
				driver.get("https://www.zomato.com/india");
				
				//switch to method
				driver.switchTo().activeElement().sendKeys("pizza", Keys. ENTER);
	}
				 
}
