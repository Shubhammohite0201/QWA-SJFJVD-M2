package WrbdriverMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithswitchmethod {
	
	public static void main(String[] args) {
		
		        //to launch the browser
				WebDriver driver = new ChromeDriver();
				
				// to maximize the bowser
				driver.manage().window().maximize();
				
				// to launch the web application
				driver.get("https://www.google.com/");
			
				driver.switchTo().activeElement().sendKeys("poha",Keys.ENTER);
				
				
	}

}
