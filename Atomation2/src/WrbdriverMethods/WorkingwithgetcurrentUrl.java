package WrbdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithgetcurrentUrl {
	
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		// to launch the web application
		driver.get("https://www.amazon.in/");
		
		// to fetch the current url
		String url = driver.getCurrentUrl();
		
		//System.out.println("the url of amazon is :"+url);
		
		if (url.equals("https://www.amazon.in/"))
		{
			System.out.println("test case is pass");
		}
		else {
			System.out.println("test case is fail");
			
		}
	}

}
