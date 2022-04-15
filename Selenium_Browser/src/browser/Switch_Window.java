package browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Window {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		
		String  windowHandle = driver.getWindowHandle();
        WebElement btnClickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
        btnClickHere.click();
        
        Set<String> allWindowhandles = driver.getWindowHandles();//23-28 needs to move into the next page.
        
        for (String handle:allWindowhandles) {
        	if (!handle.equals(windowHandle)) {
        		driver.switchTo().window(handle);
        		break;
        		
        	}
        }
        
        WebElement btnSignIn = driver.findElement(By.xpath("//*[name='btnLogin']"));
        btnSignIn.click();
	}

}
