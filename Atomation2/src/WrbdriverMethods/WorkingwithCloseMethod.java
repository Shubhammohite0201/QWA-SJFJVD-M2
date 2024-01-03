package WrbdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithCloseMethod {
	public static void main(String[] args) {
		
		        //to launch the browser
				WebDriver driver = new ChromeDriver();
				
				// to maximize the browser
				driver.manage().window().maximize();
				 
				// to lauch the webapplication
				driver.get("https://www.amazon.in/");
				
				// to close the browser
				driver.close();
	}
	

}
