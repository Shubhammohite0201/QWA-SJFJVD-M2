package webdrivermethod2;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		Point p = new Point(200, 400);
		 
		driver.manage().window().setPosition(p);
	}
}

