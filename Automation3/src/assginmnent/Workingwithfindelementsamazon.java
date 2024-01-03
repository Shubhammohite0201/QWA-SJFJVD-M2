package assginmnent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithfindelementsamazon {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]")).sendKeys("Laptop",Keys.ENTER);
		
		List<WebElement> allLaptop =driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		List<WebElement> allLaptopprice = 	driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for(WebElement Laptopprice : allLaptopprice) 
		{
			
			System.out.println(Laptopprice.getText());
		}
		
		
		for(WebElement Laptop : allLaptop) 
		{
			
			System.out.println(Laptop.getText());
		}
		
		
}
		

}
