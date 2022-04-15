package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Executor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		WebElement element = driver.findElement(By.xpath("//*[text()='REGISTER']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",element);

	}

}
