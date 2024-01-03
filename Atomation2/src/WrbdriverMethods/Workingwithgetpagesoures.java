package WrbdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithgetpagesoures {
	
	public static void main(String[] args) {
		
		//to launch the browser
				WebDriver driver = new ChromeDriver();
				
				// to maximize the browser
				driver.manage().window().maximize();
				
				// to launch the web application
				driver.get("https://www.amazon.in/");
				
				// to fetch  the  sourcecode
				String sc = driver.getPageSource();
				System.out.println(sc);
	}

}
