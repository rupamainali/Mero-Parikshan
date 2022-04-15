package browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		WebElement menuWomen = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions action = new Actions(driver);
		action.moveToElement(menuWomen).build().perform(); //Mouse hover.
		

	//	WebElement parentMenu = driver.findElement(By.xpath("//li[@class='sfHoverForce']"));
		List<WebElement> allSubMenus = driver.findElements(By.tagName("a"));
		System.out.println("Number of Elements:"+allSubMenus.size());
				for (WebElement menu:allSubMenus) {
					if (menu.getText().equals("Casual Dresses")) {
					//1.	menu.click();
					//2. action.doubleClick().build().perform();
					//3.	action.contextClick().build().perform();	// 1-3 same result.
						action.click(menu).build().perform();
						System.out.println("Menu is Clicked");
						break;
						
					}
				}
		
	}

}
