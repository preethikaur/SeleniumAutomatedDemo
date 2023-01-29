package SeleniumAutomatedDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumJavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	JavascriptExecutor js = (JavascriptExecutor) driver;

	//scrolling by some pixels
	
	//js.executeScript("window.scrollBy(0,700)");
	
	//scrolling to bottom of the page
	
	//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	WebElement target = driver.findElement(By.xpath("//span[text()='Top Sellers in Books for you']"));
	
	js.executeScript("arguments[0].scrollIntoView()",target);
	
	
	
	
	
	
	
	
	
	
	}

}
