package SeleniumAutomatedDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/contact-sales/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"Form_getForm_FullName\"]")).sendKeys("Preethi Kaur");
	driver.findElement(By.xpath("//*[@id=\"Form_getForm_Contact\"]")).sendKeys("7089956344");
	driver.findElement(By.xpath("//*[@id=\"Form_getForm_Email\"]")).sendKeys("preeti@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"Form_getForm_Country\"]")).sendKeys("India");
	driver.findElement(By.xpath("//*[@id=\"Form_getForm_JobTitle\"]")).sendKeys("Software");
	driver.findElement(By.xpath("//*[@id=\"Form_getForm_NoOfEmployees\"]")).sendKeys("50");
	driver.findElement(By.xpath("//*[@id=\"Form_getForm_Comment\"]")).sendKeys("I am looking for Job");
	
	
	
	
	
	
	}

}
