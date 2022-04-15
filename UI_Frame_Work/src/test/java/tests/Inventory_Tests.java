package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.Inventory;
import testbase.Test_Base;

public class Inventory_Tests extends Test_Base{
	
	@Test
	public void verifyThatUserCanAbleToAddTheProductInToTheCart() throws IOException {
		launchApplicaton();
		Inventory inventoryObj = new Inventory(getDriver());
		inventoryObj.addTheProductToTheCart();
		boolean cartResult = inventoryObj.verifyCart("1");
		AssertJUnit.assertTrue(false);
		closeBrowser();
	}
	
	@AfterMethod
	public void verifyTestResult(ITestResult result) throws Exception {
		
		if(result.getStatus()==ITestResult.SUCCESS) {
			System.out.println("Test Case Passed.");
		}else if(result.getStatus()==ITestResult.FAILURE) {
			takeSnapShot();
		}else if(result.getStatus()==ITestResult.SKIP) {
			System.out.println("Test Case Skipped.");
		}
	}

	@Test
	public void verifyThatUserCanAbleToAddTheMultipleProductsInToTheCart() throws IOException {
		launchApplicaton();
		Inventory inventoryObj = new Inventory(getDriver());
		inventoryObj.addTwoItems();
		boolean cartResult = inventoryObj.verifyCart("2");
		AssertJUnit.assertTrue(cartResult);
	}
	
	
	

}
