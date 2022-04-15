package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.Selenium_Implementation;

public class Login_Page extends Selenium_Implementation{
	
	@FindBy(xpath="//input[contains(@id,'user-name')]")
	WebElement userNameElement;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement passElement;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement submitButton;
	
	
	public Login_Page(WebDriver driver) {
		
PageFactory.initElements(driver,this );
		setDriver(driver);
	}
	public void performLogin(String userName,String password) {
		userNameElement.sendKeys(userName);
		passElement.sendKeys(password);
		submitButton.click();
	}
	
}
