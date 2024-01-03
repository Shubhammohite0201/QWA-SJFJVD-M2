package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithclassname {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		// active element
		driver.switchTo().activeElement().sendKeys("phoebe buffay", Keys.ENTER);
		
		// identify the guiter
		driver.findElement(By.className("lNPNe")).click();

	}

}
