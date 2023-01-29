package SeleniumAutomatedDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/contact-sales/");
	
	WebElement dropElement = driver.findElement(By.name("Country"));
	Select dropDownEmp = new Select(dropElement);
	 //dropDownEmp.selectByIndex(3);
//	dropDownEmp.selectByValue("11-15");
//	dropDownEmp.selectByVisibleText("0-10");
	
	dropDownEmp.selectByValue("India");
	
	
	
	
	
	
	
	
	
	
	
	}

}
