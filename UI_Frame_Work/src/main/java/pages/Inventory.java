package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.Selenium_Implementation;

public class Inventory extends Selenium_Implementation{
	
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement btnAddToCart;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	WebElement btnAddToCartSecondItem;
	
	public Inventory(WebDriver driver) {
		PageFactory.initElements(driver,this);
		setDriver(driver);
	}
	public void addTheProductToTheCart() {
		click(btnAddToCart);
		
	}
	public boolean verifyCart(String cartValue) {
		WebElement value = driver.findElement(By.xpath("//span[text()="+cartValue+"]"));
		return isElementDisplayed(value);
	}
	public void addTwoItems() {
		click(btnAddToCart);
		click(btnAddToCartSecondItem);
		
	}
	
}
