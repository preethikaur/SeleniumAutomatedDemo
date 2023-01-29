package SeleniumAutomatedDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMContactDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Preethi Kaur");
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("preethi@gmail.com");
		driver.findElement(By.id("Form_getForm_NoOfEmployees")).sendKeys("50");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("7569385455");
		driver.findElement(By.id("Form_getForm_Country")).sendKeys("India");
		driver.findElement(By.id("Form_getForm_JobTitle")).sendKeys("Test Engineer");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
