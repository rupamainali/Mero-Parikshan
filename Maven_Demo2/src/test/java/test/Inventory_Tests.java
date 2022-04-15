package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Inventorypage;
import pages.Login_Pages;

public class Inventory_Tests {
	
	@Test
	public void veriftThatUserCanAbleToAddProductInToTheCart() {
		
		WebDriverManager.chromedriver().setup();//
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Login_Pages obj = new Login_Pages(driver);
		obj.performLogin("standard_user", "secret_sauce");
		
		
		Inventorypage inventoryobj =  new Inventorypage(driver);
		inventoryobj.clickAddToCartButton();
		boolean result =  inventoryobj.verifyCartText();
		Assert.assertTrue(result);
		driver.close();
	}

}
