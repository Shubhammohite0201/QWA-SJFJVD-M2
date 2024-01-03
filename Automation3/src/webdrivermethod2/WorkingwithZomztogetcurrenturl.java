package webdrivermethod2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithZomztogetcurrenturl {
	
public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		// to launch web application
		driver.get("https://www.zomato.com/india");
		
		//to fetch the current url
		String url = driver.getCurrentUrl();
		
		//System.out.println("the url of zomato is :"+url);
		
		if (url.equals("https://www.zomato.com/india")) {
			
			System.out.println("test case is pass");

		}
		else {
			System.out.println("test case is fail");
			
		}
}

}
