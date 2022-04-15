package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		
		WebElement frame = driver.findElement(By.xpath("//*[@id='a077aa5e']"));
		driver.switchTo().frame(frame); //("a077aa5e"); and for index just remove frame from the box and insert any number it will work.                                    
		WebElement frameElement = driver.findElement(By.xpath("/html/body/a"));
		frameElement.click();
		
		driver.switchTo().defaultContent();
	}

}
