package com.rd.epam.Flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.rd.epam.Flipkart.base.TestBase;

public class AddToCartPage extends TestBase {

	@FindBy(how = How.XPATH, using = "//input[@class='_2csFM9']")
	WebElement productCount;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/div/button[2]")
	WebElement increaseQuanitity;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"container\"]/div/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/div/button[1]")
	WebElement decreaseQuanitity;
	

	public AddToCartPage(WebDriver driver) {
		this.driver=driver;

	}

	public int cartSize() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Integer.valueOf(productCount.getAttribute("value"));
	}
	
	public void increaseQuantity() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		increaseQuanitity.click();
	}
	
	public void decreaseQuantity() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		decreaseQuanitity.click();
	}
}
