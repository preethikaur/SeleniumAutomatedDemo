package SeleniumAutomatedDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.findElement(By.id("promptexample")).click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		Thread.sleep(4000);
		driver.close();
		
		
	
	
	
	
	
	}

}
