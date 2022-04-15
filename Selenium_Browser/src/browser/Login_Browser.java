package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName = driver.findElement(By.id("user-name"));
	//	userName.sendKeys("standard_user");
		Actions action = new Actions(driver);
	//	action.sendKeys("standard_user").build().perform();
		action.click(userName).sendKeys("standard_user").build().perform();
		

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		
		WebElement submit = driver.findElement(By.name("login-button"));
		submit.click();
		
		
	}

}
