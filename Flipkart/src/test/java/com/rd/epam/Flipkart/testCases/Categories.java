package com.rd.epam.Flipkart.testCases;

import org.openqa.selenium.By;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rd.epam.Flipkart.base.ScreenshotFailed;
import com.rd.epam.Flipkart.base.TestBase;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Categories extends TestBase {
	int statusCode;
	List<Integer> list;
	List<Integer> integerList;
	int sizeoflist;
	ExtentTest logger;
	
	@BeforeTest
	public void init() {
		initialization();
		logger=extent.startTest("CategoriesTestRestAssured");
	}

	@Test
	public void checkLinks() {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		List<WebElement> links = driver.findElements(By.xpath("//span[@class='nsslWl']/parent::a"));
		RestAssured.baseURI = "https://www.flipkart.com/";
		sizeoflist = links.size();
		list = new ArrayList<Integer>();
		Integer[] integers = new Integer[sizeoflist];
		Arrays.fill(integers, 200);
		integerList = Arrays.asList(integers);
		for (WebElement link : links) {
			RequestSpecification httpRequest = RestAssured.given();
			Response response = httpRequest.get();
			statusCode = response.getStatusCode();
			list.add(statusCode);
		}
		Assert.assertEquals(list, integerList);
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