package browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Browser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/Pro/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		System.out.println("No of Rows is:" + allRows.size());

		WebElement tableDataFourthRowSecondColumn = driver
				.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[2]"));
		String value = tableDataFourthRowSecondColumn.getText();
		System.out.println("Name is :" + value);

		List<WebElement> noOfColumns = table.findElements(By.tagName("th"));
		int noOfColumnValue = noOfColumns.size();
		System.out.println("No pf Columns:" + noOfColumnValue);

		for (int i = 2; 1 < allRows.size(); i++) {
			for (int j = 1; j <= noOfColumnValue; j++) {
				WebElement tableElement = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(tableElement.getText());

			}

		}

		List<WebElement> allTableData = table.findElements(By.tagName("td"));
		for (WebElement td : allTableData) {
			System.out.println(td.getText());
		}

	}

}
