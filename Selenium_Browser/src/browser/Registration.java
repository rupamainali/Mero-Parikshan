package browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");

		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Jack");

		WebElement countryDropDown = driver.findElement(By.name("country"));
		Select selectDropDown = new Select(countryDropDown);
		
		selectDropDown.selectByVisibleText("ANGOLA");

		selectDropDown.selectByValue("ANGOLA");

		selectDropDown.selectByIndex(3);

	}

}
