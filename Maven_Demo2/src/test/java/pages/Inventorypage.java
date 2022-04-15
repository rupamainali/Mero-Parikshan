package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inventorypage {
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement btnAddToCart;
	
	@FindBy(xpath="//span[text()='1']")
	WebElement cartTextOne;

	
	public Inventorypage( WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	

	public void clickAddToCartButton() {
		
		btnAddToCart.click();
		
	}
	public boolean verifyCartText() {
		
		boolean isDisplayed = cartTextOne.isDisplayed();
		return isDisplayed;
		
		
		
	}

}
