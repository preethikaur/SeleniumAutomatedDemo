package SeleniumAutomatedDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = driver.getTitle();
		System.out.println(expectedTitle);
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("TC is passed");
		}
		
			
			else
			{
				System.out.println("TC is Failed");	
		}
	
	
	
	
	}

}
