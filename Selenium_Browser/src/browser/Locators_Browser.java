package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement btnSubmit = driver.findElement(By.name("login-button"));
		
		if(userName.isDisplayed() && pass.isDisplayed() && btnSubmit.isDisplayed()) {
			userName.sendKeys("standard_user");
			pass.sendKeys("secret_sauce");
			btnSubmit.click();
		}
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		 String url = driver.getCurrentUrl();
		
		 if (expectedUrl.equals(url)) {
			 System.out.println("Test Case is Passed");
		 }else {
			 System.out.println("Test Case is Failed");
			 
		 }
		 WebElement btnAddToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		 btnAddToCart.click();
		 
		 WebElement cartElement = driver.findElement(By.xpath(" //a/span[text()='1']"));
		 String carttext = cartElement.getText();
		 
		 if (carttext.equals("1")) {
			 System.out.println("Test Case is Passed");
		 }else {
			 System.out.println("Test Case is Failed");
			 
		 }
		 WebElement btnRemove = driver.findElement(By.id("remove-sauce-labs-backpack"));
		 String removeButtonText = btnRemove.getText();
		 if (removeButtonText.equals("REMOVE")) {
			 System.out.println("Test Case is Passed");
		 }else {
			 System.out.println("Test Case is Failed");
		 }
		 
		 
	}

}
