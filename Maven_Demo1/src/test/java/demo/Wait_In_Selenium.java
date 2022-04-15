package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_In_Selenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement userNameElement = driver.findElement(By.id("user-name"));
		userNameElement.sendKeys("standard_user");

		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("secret_sauce");

		WebElement btnSubmit = driver.findElement(By.id("login-button"));
		btnSubmit.click();

		WebElement btnAddToCart = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		btnAddToCart.click();

		WebDriverWait wait = new WebDriverWait(driver, 3);
		// WebElement cartIcon = driver.findElement(By.xpath("//span[text()='2']"));
		// wait.until(ExpectedConditions.visibilityOf(cartIcon));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='1']")));

	}

}
