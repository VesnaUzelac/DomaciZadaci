package SeleniumOsnove;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {



	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://practicetestautomation.com/");
	WebElement practice = driver.findElement(By.cssSelector("#menu-item-20"));
	practice.click(); 
	Thread.sleep(2000);
	WebElement testLogin = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a"));
	Thread.sleep(2000);
	testLogin.click();
	Thread.sleep(2000);
	WebElement username = driver.findElement(By.id("username"));
	username.clear();
	username.sendKeys("student");
	WebElement password = driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys("Password123");
	WebElement submit = driver.findElement(By.id("submit"));
	submit.click();
	WebElement loggedInSuccessfully = driver.findElement(By.id("loop-container"));
	Thread.sleep(2000);
	WebElement congretulaionMessage = driver.findElement(By.cssSelector("#loop-container > div > article > div.post-content > p.has-text-align-center"));
	Thread.sleep(2000);
	WebElement logOut = driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
	logOut.click();
	driver.close();
	
	
	
	
	
	
	
	}
	
}

