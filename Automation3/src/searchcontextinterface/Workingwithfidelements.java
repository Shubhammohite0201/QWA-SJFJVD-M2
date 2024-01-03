package searchcontextinterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithfidelements {

	

		public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.flipkart.com/");

			driver.findElement(By.xpath("//span[text()='✕']")).click();

			driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone", Keys.ENTER);

			List<WebElement> alliphone = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

			for (WebElement iphone : alliphone) {
				System.out.println(iphone.getText());
			}
		}
	}
			
			


