package assginmnent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithinstalogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.instagram.com/");

		//Thread.sleep(2000);

		// identify username
		driver.findElement(By.name("username")).sendKeys("Sankes2050@gmail.com");

		// identify password
		driver.findElement(By.name("password")).sendKeys("8857903175");

		// identify login
		driver.findElement(By.className("_acap")).click();

	}

}
