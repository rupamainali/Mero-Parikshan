package demo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Inventory_Updated {
 
	@Test(enabled = true,priority = 1,groups = {"smoke","regression"},dataProvider = "loginData") //(enabled = true,priority = 1,dependsOnMethods ="verifyThatUserCanAddTheProductInToCartSoftAssertion")  //(enabled = false) 
	public void verifyThatUserCanAddTheProductInToCartHardAssertion(String uname, String pass) {
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//url
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
		WebElement btnSubmit = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		userName.sendKeys(uname);
		password.sendKeys(pass);
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
		driver.close();
		
	
		
	
		
	}
	@Test(enabled = true,priority = 0,groups = {"sanity"})    //(enabled = true)
	@Parameters({"userName","passWord"})
	public void verifyThatUserCanAddTheProductInToCartSoftAssertion(String uname,String pass) {
		SoftAssert assertion = new SoftAssert();
		System.setProperty("webdriver.chrome.driver","/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//url
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
		WebElement btnSubmit = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		userName.sendKeys(uname);
		password.sendKeys(pass);
		btnSubmit.click();
		
		//url failed - hard asssertion
		
		WebElement element = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
		boolean result = element.isDisplayed();
	//	assertion.assertTrue(false); // failed.
		
		
		WebElement btnAddToCart = driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack"));
		btnAddToCart.click();
		
		WebElement cartTextElement = driver.findElement(By.xpath("//span[text()='1']"));
		String cartText = cartTextElement.getText();  //Actual
		assertion.assertEquals(cartText, "1"); //try inserting 2. //passed.
		assertion.assertAll();
		driver.close();
		
		
	}
	
	@DataProvider(name = "loginData")
	public Object[] [] getloginData() {
		return new Object [] [] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
		
		};
		
	}
		
}
