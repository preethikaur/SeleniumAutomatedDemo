package SeleniumAutomatedDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.ous.jtoml.Toml;

public class ActionsDemo {

	private static final String International = null;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		//mouseHover1();
	//keyboardEvents();
	//rightClick();
	scrollBy();
		//dragDrop();
	
	
	}
		
	
	
	



	public static void mouseHover1() {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement Kidsmenu = driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[3]/div/a"));
		Actions act = new Actions(driver);
		act.moveToElement(Kidsmenu).perform();
		driver.close();
		}
		
	public static void keyboardEvents() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		String email = "testemail";
		Actions act = new Actions(driver);
		act.click(username).keyDown(Keys.SHIFT).sendKeys(email).keyUp(Keys.SHIFT).perform();
		WebElement password = driver.findElement(By.id("pass"));
		String pass = "preethi123";
		Actions act1 = new Actions(driver);
		act1.click(password).keyDown(Keys.SHIFT).sendKeys(pass).keyUp(Keys.SHIFT).perform();
	}
	
		public static void rightClick() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
		     WebElement Fashion = driver.findElement(By.xpath("//*[@id=\"swm-link\"]"));
		   Actions act = new Actions(driver);
		   act.contextClick(Fashion).perform();
		 }
		
		public static void scrollBy() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");	
			driver.findElement(By.xpath("//*[@id=\"a9a2011f-bac7-4902-a843-6f607e2f1404\"]/div[1]/h2/span"));
			Actions act = new Actions(driver);
			act.scrollByAmount(0, 1000);
			//act.moveToElement(International Toml sellers);
		}
			
		
	
	public static void dragDrop() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");	
	    driver.switchTo().frame(0);
		WebElement source= 	driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
	    Actions act = new Actions(driver);
	    act.dragAndDrop(source,target).perform();
	    }
	
	

	
	
	
	

		
		
		
		
		
		
		
		
	
			
	
		
	
			
		
	
	
	
	
	
	
	
	
	

	
	

	
}
