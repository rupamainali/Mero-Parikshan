package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\'credit2\']/a"));
		WebElement targetElement = driver.findElement(By.xpath("//*[@id=\'bank\']/li"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement,targetElement).build().perform();

	}

}
