package SeleniumAutomatedDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/checkboxes");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	driver.manage().window().maximize();
	WebElement Ele;
	Ele = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
	System.out.println(Ele.isDisplayed());
	System.out.println(Ele.isEnabled());
	System.out.println(Ele.isSelected());
	System.out.println("After Clicking");
	Ele.click();
	System.out.println(Ele.isDisplayed());
	System.out.println(Ele.isEnabled());
	System.out.println(Ele.isSelected());
	
	
	
	
	
	
	
	
	driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	}


