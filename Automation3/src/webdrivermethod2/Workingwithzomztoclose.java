package webdrivermethod2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithzomztoclose {
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		 driver.manage().window().maximize();
		   
		// to launch web appliction
		 driver.get("https://www.zomato.com/india");
		 
		 // to fetch the tite
		String title= driver.getTitle()
				
				
		 
		 // to close method
		 driver.close();
	}

}
