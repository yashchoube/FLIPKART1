package com.rd.epam.Flipkart.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


import java.io.IOException;



import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rd.epam.Flipkart.base.ScreenshotFailed;
import com.rd.epam.Flipkart.base.TestBase;
import com.rd.epam.Flipkart.pages.AddToCartPage;

import com.rd.epam.Flipkart.pages.ProductPage;
import com.rd.epam.Flipkart.pages.SearchPage;
import com.rd.epam.Flipkart.pages.SearchResultsPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AddToCartPageTest extends TestBase {
	AddToCartPage cartPage;
	SearchPage searchPage;
	SearchResultsPage resultsPage;
	ProductPage productPage;
	ExtentTest logger;

	public AddToCartPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initialization();
		searchPage = PageFactory.initElements(driver, SearchPage.class);
		logger=extent.startTest("AddtoCartTest");
	}

	@Test
	public void checkSearchBar() {
		assertTrue(searchPage.checkSearchBar());
	}
	
	@Test(dependsOnMethods = "checkSearchBar")
	public void checkResults() {
		searchPage.setSearchBar("gulab jamun");
		resultsPage = searchPage.clickOnSearchButton();
		resultsPage.performFilter();
		assertTrue(resultsPage.checkResult());
	}
	
	@Test(dependsOnMethods = "checkResults")
	public void addFirstProduct() {
			productPage = resultsPage.clickProduct();
			cartPage = productPage.clickAddToCart();
			assertEquals(cartPage.cartSize(),1);
	}
	
	@Test(dependsOnMethods = "checkSize")
	public void checkIncrease() {
			cartPage.increaseQuantity();
			assertEquals(cartPage.cartSize(),2);
	}
	
	@Test(dependsOnMethods = "checkIncrease")
	public void checkDecrease() {
			cartPage.decreaseQuantity();
			assertEquals(cartPage.cartSize(),1);
	}

	@AfterMethod
    public void screenShot(ITestResult result) throws IOException {
        if (ITestResult.SUCCESS == result.getStatus()) {
            logger.log(LogStatus.PASS, result.getName() + " test case Passed");
        }

 

        else if (ITestResult.FAILURE == result.getStatus()) {
            String path = ScreenshotFailed.getScreenshot(driver, result.getName());
            logger.log(LogStatus.FAIL, result.getName() + " test Case Failed ", logger.addScreenCapture(path));
        }

 

        else if (ITestResult.SKIP == result.getStatus()) {
            logger.log(LogStatus.SKIP, result.getName() + " test case skipped");
        }
    }

}
