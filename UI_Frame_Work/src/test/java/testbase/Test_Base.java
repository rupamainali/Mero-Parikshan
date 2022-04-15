package testbase;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login_Page;
import selenium.Selenium_Implementation;
import util.Utility;

public class Test_Base extends Selenium_Implementation{
	
	public void launchApplicaton() throws IOException {
		
	
		String browserName = Utility.readProperty("browser"); 
		System.out.println("Browser Name:"+browserName);
		if(browserName.equals("chrome")) {          
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			setDriver(driver);
		}
		maximizeBrowser();
		
		String url =  Utility.readProperty("url");
		openUrl(url);
		Login_Page obj =  new Login_Page(driver);
		String userName = Utility.readProperty("userName");
		String password = Utility.readProperty("password");
		obj.performLogin(userName, password);
	}

}
