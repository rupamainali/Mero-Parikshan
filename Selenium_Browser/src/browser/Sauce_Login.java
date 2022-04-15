package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class Sauce_Login {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName = driver.findElement(By.id("user-name"));
	
		Actions action = new Actions(driver);
	
		action.click(userName).sendKeys("standard_user").build().perform();
		

// 	    WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("secret_sauce");
//		action.sendKeys(Keys.TAB).sendKeys("secret_sauce").build().perform(); // Same action as given below. 
		
		action.sendKeys(Keys.TAB).sendKeys("secret_sauce").sendKeys(Keys.ENTER).build().perform();
		
		WebElement submit = driver.findElement(By.name("login-button"));
		submit.click();
		
		
	}

}
