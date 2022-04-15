package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_First {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

}
