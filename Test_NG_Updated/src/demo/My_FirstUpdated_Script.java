package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class My_FirstUpdated_Script {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am from before test.");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am from before test.");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am from before class.");
	}
	@BeforeMethod
	public void setReport() {
		System.out.println("My Configuration from before test.");
	}
	@Test(priority = 1 , enabled = false) //  @Test(priority = 1 ,enabled = false)
	public void verifyThatUserCanAbleToLogin() {
		System.out.println("My First Script.");
	}
	@AfterMethod
	public void setReportAfterMethod() {
		System.out.println("My Configuration from after test.");
	}
	@Test(priority = 2)
	public void verifyThatUserCanAbleToAddProductToTheCart() {
		System.out.println("My Second Script.");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am from after class.");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am from after test.");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am from after suite.");
	}

}
