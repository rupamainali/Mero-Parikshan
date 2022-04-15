package browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		WebElement menuWomen = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions action = new Actions(driver);
		action.moveToElement(menuWomen).build().perform();
		
		WebElement menuBlouses = driver.findElement(By.xpath("//li/a[@title='Blouses']"));
		menuBlouses.click();
		
	
	}

}
