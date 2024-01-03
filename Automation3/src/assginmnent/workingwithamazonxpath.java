package assginmnent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithamazonxpath {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]")).sendKeys("Laptop",Keys.ENTER);
		
	WebElement Laptopprice	=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::div[@class='a-row'][3]"));
	
	   System.out.println(Laptopprice.getText());
	}

}
