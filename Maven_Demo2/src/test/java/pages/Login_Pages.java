package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pages {
	
	@FindBy(xpath="//*[@id='user-name']")
	WebElement userNameElement;
	
	

	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	
	
	@FindBy(xpath="//*[@id='login-button']")
	WebElement btnLogin;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement btnAddToCart;
	
	@FindBy(xpath="//span[text()='1']")
	WebElement cartTextOne;
	
	public Login_Pages(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickAddToCartButton() {
		
		btnAddToCart.click();
		
	}
	public boolean verifyCartText() {
		
		boolean isDisplayed = cartTextOne.isDisplayed();
		return isDisplayed;
		
		
		
	}
	
	public void performLogin(String userName,String pass) {
		
		userNameElement.sendKeys(userName);
		password.sendKeys(pass);
		btnLogin.click();
		
	}
}
