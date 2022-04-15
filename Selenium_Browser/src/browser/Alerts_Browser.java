package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		WebElement sourceElement = driver.findElement(By.name("submit")); //By.xpath ("//*[@name=\'submit\']"
		sourceElement.click();
		
//		driver.switchTo().alert().accept();
//		
//		driver.switchTo().alert().accept();
		
//		driver.switchTo().alert().dismiss();
		
//		String str = driver.switchTo().alert().getText();
//		System.out.println("Alert Text:"+str);
//		driver.switchTo().alert().dismiss();
//		
//		
	//	driver.switchTo().alert().sendKeys("15");

	}

}
