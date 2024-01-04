package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Workingwithselectbyvalue {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		
	    WebElement dropdrown =	driver.findElement(By.id("select3"));
	    
	    //create object for select class
	    Select s = new Select(dropdrown);
	    
	    // using select by value
	    s.selectByValue("China");
	    
	    
	

}

}

