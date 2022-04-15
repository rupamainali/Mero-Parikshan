package selenium;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Utility;

public class Selenium_Implementation {
	
	protected WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void maximizeBrowser() {
		getDriver().manage().window().maximize();
	}
	
	public void openUrl(String url) {
		
		getDriver().get(url);
	}
	public void click(WebElement element) {
		element.click();
	}
	
	public boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	public void closeBrowser() {
		getDriver().close();
	}
	public  void takeSnapShot() throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)getDriver());
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		String dateAndTime = Utility.getcurrentDateAndTime();
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss")
				.format(new Date());
		String fileName = "failed"+dateName+".png";
		System.out.println("File Name Is:"+fileName);
		System.out.println("File path:"+System.getProperty("user.dir")+"/Screenshots/"+fileName);
		File DestFile=new File(System.getProperty("user.dir")+"/Screenshots/"+fileName);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}
}
