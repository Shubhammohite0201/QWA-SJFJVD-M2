package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithname {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.name("Email")).sendKeys("shubhuamm@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("1234");
		
		
		
		
}
		

}
