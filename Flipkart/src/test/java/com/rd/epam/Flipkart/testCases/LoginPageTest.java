package com.rd.epam.Flipkart.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.rd.epam.Flipkart.base.ScreenshotFailed;
import com.rd.epam.Flipkart.base.TestBase;
import com.rd.epam.Flipkart.pages.HomePage;
import com.rd.epam.Flipkart.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ExtentTest logger;

	public LoginPageTest() {

		super();

	}

	@BeforeTest
	public void setUp() {

		initialization();
		loginPage = new LoginPage();
		logger=extent.startTest("LoginPageTest");
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");

	}

	@Test(priority = 2)
	public void validateLogin() {
		homePage = loginPage.loginFunction(properties.getProperty("username"), properties.getProperty("password"));
		Assert.assertTrue(homePage.checkLogin());
	}

	@Test(dependsOnMethods = "validateLogin")
	public void checkName() {
		String actualTitle = homePage.getHomeUserLabelText();
		Assert.assertEquals(actualTitle, "Yash");

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
