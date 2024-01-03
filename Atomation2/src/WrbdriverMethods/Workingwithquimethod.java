package WrbdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithquimethod {
	
	public static void main(String[] args) {
		
		        //to launch the browser
				WebDriver driver = new ChromeDriver();
				
				// to maximize the browser
				driver.manage().window().maximize();
				 
				// to launch the Web Application
				driver.get("https://omayo.blogspot.com/");
				
				// to click on new popup window
				driver.findElement(By.xPatch("//a[text()='open a popum window']")).click();
				
				driver.quit();
				
				
	}

}
