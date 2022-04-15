package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Inventory_Test {
	@Test(enabled = false)  //(enabled = false) 
	public void verifyThatUserCanAddTheProductInToCartHardAssertion() {
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//url
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
		WebElement btnSubmit = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		btnSubmit.click();
		
		//url failed - hard asssertion
		
		WebElement element = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
		boolean result = element.isDisplayed();
		Assert.assertTrue(result); //Try (false)
		
		
		WebElement btnAddToCart = driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack"));
		btnAddToCart.click();
		
		WebElement cartTextElement = driver.findElement(By.xpath("//span[text()='1']"));
		String cartText = cartTextElement.getText();  //Actual
		Assert.assertEquals(cartText, "1"); //try inserting 2.
		
		
	
		
	
		
	}
	@Test(enabled = true)    //(enabled = true)
	public void verifyThatUserCanAddTheProductInToCartSoftAssertion() {
		SoftAssert assertion = new SoftAssert();
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//url
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
		WebElement btnSubmit = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		btnSubmit.click();
		
		//url failed - hard asssertion
		
		WebElement element = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
		boolean result = element.isDisplayed();
		assertion.assertTrue(false); // failed.
		
		
		WebElement btnAddToCart = driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack"));
		btnAddToCart.click();
		
		WebElement cartTextElement = driver.findElement(By.xpath("//span[text()='1']"));
		String cartText = cartTextElement.getText();  //Actual
		assertion.assertEquals(cartText, "1"); //try inserting 2. //passed.
		assertion.assertAll();
		
		
	}
		
	

}
