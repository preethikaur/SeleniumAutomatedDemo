package SeleniumAutomatedDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintSeleniumTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("TC is passed");
		}
		
		else
		{
			System.out.println("TC is Fail");
		}
	
	
	
	
	
	}

}
