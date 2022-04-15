package browser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class By_Xpath {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");                                    

		WebElement selectDropDown = driver.findElement(By.xpath("//select[@name='country']"));
		selectDropDown.click();

		List<WebElement> allDropDownValues = selectDropDown.findElements(By.tagName("option"));

		for (int i = 0; i < allDropDownValues.size(); i++) {
			if (allDropDownValues.get(i).getText().equals("BAHAMAS")) {
				allDropDownValues.get(i).click();
				break;
			}
		}
        Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease (KeyEvent.VK_ESCAPE);
		

	}

}
