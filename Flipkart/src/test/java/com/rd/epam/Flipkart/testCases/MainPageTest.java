package com.rd.epam.Flipkart.testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rd.epam.Flipkart.base.ScreenshotFailed;
import com.rd.epam.Flipkart.base.TestBase;
import com.rd.epam.Flipkart.pages.MainPageLinks;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MainPageTest extends TestBase {

	WebDriver driver;
	MainPageLinks mainPage;
	ExtentTest logger;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		mainPage = PageFactory.initElements(driver, MainPageLinks.class);
		mainPage.closePopUP();
		logger=extent.startTest("CategoriesLinks");
	}

	@Test
	void testMobile() {
		mainPage.clickOnElectronics();
		mainPage.clickOnMobile();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mobile-phones-store?otracker=nmenu_sub_Electronics_0_Mobiles");
	}

	@Test
	void testMobileAccessories() {
		mainPage.clickOnElectronics();
		mainPage.clickOnMobileAccessories();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mobile-accessories/pr?sid=tyy,4mr&otracker=nmenu_sub_Electronics_0_Mobile%20Accessories");
	}

	@Test
	void testMobileSmartWearableTech() {
		mainPage.clickOnElectronics();
		mainPage.clickOnSmartWearableTech();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/smart-wearables-store?otracker=nmenu_sub_Electronics_0_Smart%20Wearable%20Tech");

	}

	@Test
	public void testOnHealthCareAppliances() {
		mainPage.clickOnElectronics();
		mainPage.clickOnHealthCareAppliances();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/health-and-appliances-store?otracker=nmenu_sub_Electronics_0_Health%20Care%20Appliances");
	}

	@Test
	public void testOnLaptops() {
		mainPage.clickOnElectronics();
		mainPage.clickOnLaptops();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/laptops-store?otracker=nmenu_sub_Electronics_0_Laptops");
	}

	@Test
	public void testOnDesktopPCS() {
		mainPage.clickOnElectronics();
		mainPage.clickOnDesktopPCS();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/desktop-pc-store?otracker=nmenu_sub_Electronics_0_Desktop%20PCs");
	}

	@Test
	public void testOnGamesAndAccessories() {
		mainPage.clickOnElectronics();
		mainPage.clickOnGamesAndAccessories();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/gaming-store?otracker=nmenu_sub_Electronics_0_Gaming%20%26%20Accessories");
	}

	@Test
	public void testOnComputerAccessories() {
		mainPage.clickOnElectronics();
		mainPage.clickOnComputerAccessories();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/computer-accessories-store?otracker=nmenu_sub_Electronics_0_Computer%20Accessories");
	}

	@Test
	public void testOnComputerPeripherals() {
		mainPage.clickOnElectronics();
		mainPage.clickOnComputerPeripherals();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/peripherals-store?otracker=nmenu_sub_Electronics_0_Computer%20Peripherals");
	}

	@Test
	public void testOnTablets() {
		mainPage.clickOnElectronics();
		mainPage.clickOnTablets();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/tablets-store?otracker=nmenu_sub_Electronics_0_Tablets");
	}

	@Test
	public void testOnSpeakers() {
		mainPage.clickOnElectronics();
		mainPage.clickOnSpeakers();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/audio-video/speakers/pr?sid=0pm%2C0o7&p%5B%5D=facets.fulfilled_by%255B%255D%3DFlipkart%2BAssured&otracker=categorytree&p%5B%5D=facets.serviceability%5B%5D%3Dtrue&p%5B%5D=facets.availability%255B%255D%3DExclude%2BOut%2Bof%2BStock&otracker=nmenu_sub_Electronics_0_Speakers");

	}

	@Test
	public void testOnSmartHomeAutomation() {
		mainPage.clickOnElectronics();
		mainPage.clickOnSmartHomeAutomation();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/smart-home-automation-store?otracker=nmenu_sub_Electronics_0_Smart%20Home%20Automation");

	}

	@Test
	public void testOnCamera() {
		mainPage.clickOnElectronics();
		mainPage.clickOnCamera();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/camera-clp-store?otracker=nmenu_sub_Electronics_0_Camera");

	}

	@Test
	public void testOnCameraAccessories() {
		mainPage.clickOnElectronics();
		mainPage.clickOnCameraAccessories();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/cameras-accessories-store?otracker=nmenu_sub_Electronics_0_Camera%20Accessories");

	}

	

	@Test
	public void testOnAndroidTVs() {
		mainPage.clickOnTVsAppliances();
		mainPage.clickOnAndroidTVs();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/televisions/pr?sid=ckf%2Cczl&otracker=categorytree&p%5B%5D=facets.operating_system%255B%255D%3DOfficial%2BAndroid&p%5B%5D=facets.operating_system%255B%255D%3DAndroid&p%5B%5D=facets.serviceability%5B%5D%3Dtrue&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Android%20TVs");

	}

	@Test
	public void testOnSmartUltraHD() {
		mainPage.clickOnTVsAppliances();
		mainPage.clickOnSmartUltraHD();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/search?count=40&otracker=CLP_filters&p%5B%5D=facets.smart_tv%255B%255D%3DYes&p%5B%5D=facets.resolution%255B%255D%3DUltra%2BHD%2B%25284K%2529&sid=ckf%2Fczl&otracker=nmenu_sub_TVs%20and%20Appliances_0_Smart%20and%20Ultra%20HD&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Smart%20%26%20Ultra%20HD");

	}

	@Test
	public void testOnWashingMachine() {
		mainPage.clickOnTVsAppliances();
		mainPage.clickOnWashingMachine();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/washing-machine-store?otracker=nmenu_sub_TVs%20%26%20Appliances_0_Washing%20Machine");

	}

	@Test
	public void testOnAirConditioners() {
		mainPage.clickOnTVsAppliances();
		mainPage.clickOnAirConditioners();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/air-conditioners/pr?sid=j9e%2Cabm%2Cc54&p%5B%5D=facets.serviceability%5B%5D%3Dtrue&otracker=categorytree&p%5B%5D=facets.fulfilled_by%255B%255D%3DFlipkart%2BAssured&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Air%20Conditioners");

	}

	
	
	

	
	@Test
	public void clickOnFootwear() {
		mainPage.clickOnMen();
		mainPage.clickOnFootwear();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-footwear/pr?sid=osp,cil&otracker=nmenu_sub_Men_0_Footwear");

	}

	@Test
	public void clickOnMensGrooming() {
		mainPage.clickOnMen();
		mainPage.clickOnMensGrooming();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-grooming-store?otracker=nmenu_sub_Men_0_Men%27s%20Grooming");
	}

	@Test
	public void clickOnClothing() {
		mainPage.clickOnMen();
		mainPage.clickOnClothing();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/pr?sid=2oq,s9b&otracker=categorytree&otracker=nmenu_sub_Men_0_Clothing");
	}

	@Test
	public void clickOnTopWear() {
		mainPage.clickOnMen();
		mainPage.clickOnTopWear();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/~mens-top-wear/pr?sid=2oq%2Cs9b&otracker=nmenu_sub_Men_0_Top%20wear");
	}

	@Test
	public void clickOnBottomWear() {
		mainPage.clickOnMen();
		mainPage.clickOnBottomWear();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/~mens-bottom-wear/pr?sid=2oq%2Cs9b&otracker=nmenu_sub_Men_0_Bottom%20wear");
	}

	@Test
	public void clickOnTiesSocksCapsmore() {
		mainPage.clickOnMen();
		mainPage.clickOnTiesSocksCapsmore();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/accessories-combo-sets/pr?sid=2oq,s9b,8jf&otracker=nmenu_sub_Men_0_Ties%2C%20Socks%2C%20Caps%20%26%20more");
	}

	@Test
	public void clickOnKurtaPyjamamore() {
		mainPage.clickOnMen();
		mainPage.clickOnKurtaPyjamamore();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/ethnic-wear/pr?sid=2oq,s9b,3a0&otracker=nmenu_sub_Men_0_Kurta%2C%20Pyjama%20%26%20more");
	}

	@Test
	public void clickOnFabrics() {
		mainPage.clickOnMen();
		mainPage.clickOnFabrics();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/fabrics/pr?sid=2oq,s9b,9hz&otracker=nmenu_sub_Men_0_Fabrics");
	}

	@Test
	public void clickOnSeasonalWear() {
		mainPage.clickOnMen();
		mainPage.clickOnSeasonalWear();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/winter-seasonal-wear/pr?sid=2oq,s9b,qgu&otracker=nmenu_sub_Men_0_Seasonal%20Wear");
	}

	@Test
	public void clickOnSportsWear() {
		mainPage.clickOnMen();
		mainPage.clickOnSportsWear();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/sports-wear/pr?sid=2oq,s9b,6gr&otracker=nmenu_sub_Men_0_Sports%20wear");
	}

	@Test
	public void clickOnInnerwearSleepwear() {
		mainPage.clickOnMen();
		mainPage.clickOnInnerwearSleepwear();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-clothing/inner-wear-sleep-wear/pr?sid=2oq,s9b,b1a&otracker=nmenu_sub_Men_0_Innerwear%20%26%20Sleepwear");
	}

	@Test
	public void clickOnWatches() {
		mainPage.clickOnMen();
		mainPage.clickOnWatches();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-watches-store?otracker=nmenu_sub_Men_0_Watches");
	}

	@Test
	public void clickOnSportsFitnessStore() {
		mainPage.clickOnMen();
		mainPage.clickOnSportsFitnessStore();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/sport-store?otracker=nmenu_sub_Men_0_Sports%20%26%20Fitness%20Store");
	}

	@Test
	public void clickOnAccessories() {
		mainPage.clickOnMen();
		mainPage.clickOnAccessories();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/mens-bags-wallet-store?otracker=nmenu_sub_Men_0_Accessories");
	}

	

	@Test
	public void clickOnPersonalCareAppliances() {
		mainPage.clickOnMen();
		mainPage.clickOnPersonalCareAppliances();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/personal-care-appliances-men-store?otracker=nmenu_sub_Men_0_Personal%20Care%20Appliances");
	}

	
	@Test
	public void clickOnWesternWear() {
		mainPage.clickOnWomen();
		mainPage.clickOnWesternWear();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/western-wear/pr?sid=2oq,c1r,ha6&p[]=facets.serviceability%5B%5D%3Dtrue&otracker=categorytree&otracker=nmenu_sub_Women_0_Western%20Wear");

	}

	@Test
	public void clickOnSwimBeech() {
		mainPage.clickOnWomen();
		mainPage.clickOnSwimBeech();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/lingerie-sleep-swimwear/swim-beach-wear/pr?sid=2oq,c1r,tbt,wg3&p[]=facets.serviceability%5B%5D%3Dtrue&otracker=categorytree&otracker=nmenu_sub_Women_0_Swim%20%26%20Beachwear");

	}

	@Test
	public void clickOnWinterSeasonalWear() {
		mainPage.clickOnWomen();
		mainPage.clickOnWinterSeasonalWear();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/winter-seasonal-wear/pr?sid=2oq,c1r,67x&otracker=nmenu_sub_Women_0_Winter%20and%20Seasonal%20Wear&otracker=nmenu_sub_Women_0_Winter%20%26%20Seasonal%20Wear&otracker=nmenu_sub_Women_0_Winter%20%26%20Seasonal%20Wear");

	}

	@Test
	public void clickOnPartyDresses() {
		mainPage.clickOnWomen();
		mainPage.clickOnPartyDresses();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/women/dresses/party~occasion/pr?sid=2oq,c1r,ha6,xzt,3y0&otracker=nmenu_sub_Women_0_Party%20Dresses");

	}

	@Test
	public void clickOnEthnicWear() {
		mainPage.clickOnWomen();
		mainPage.clickOnEthnicWear();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/ethnic-wear/pr?sid=2oq,c1r,3pj&otracker=nmenu_sub_Women_0_Ethnic%20Wear&otracker=nmenu_sub_Women_0_Ethnic%20Wear");

	}

	@Test
	public void clickOnInternationalBrands() {
		mainPage.clickOnWomen();
		mainPage.clickOnInternationalBrands();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/pr?sid=2oq%2Cc1r&otracker=categorytree&p%5B%5D=facets.brand%255B%255D%3DVero%2BModa&p%5B%5D=facets.brand%255B%255D%3DOnly&p%5B%5D=facets.brand%255B%255D%3DLevi%2527s&p%5B%5D=facets.brand%255B%255D%3DPepe%2BJeans&p%5B%5D=facets.brand%255B%255D%3DLee&p%5B%5D=facets.brand%255B%255D%3DForever%2B21&p%5B%5D=facets.brand%255B%255D%3DADIDAS&p%5B%5D=facets.brand%255B%255D%3DPuma&p%5B%5D=facets.brand%255B%255D%3DNike&p%5B%5D=facets.brand%255B%255D%3DUnited%2BColors%2Bof%2BBenetton&otracker=nmenu_sub_Women_0_International%20Brands");
	}

	@Test
	public void clickOnNewArrivals() {
		mainPage.clickOnWomen();
		mainPage.clickOnNewArrivals();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/pr?count=40&otracker=categorytree&p%5B%5D=facets.brand%255B%255D%3DRemanika&p%5B%5D=facets.brand%255B%255D%3DRain%2Band%2Brainbow&p%5B%5D=facets.brand%255B%255D%3DRain%2Band%2BRainbow&p%5B%5D=facets.brand%255B%255D%3DNGT&p%5B%5D=facets.brand%255B%255D%3DPAMO&p%5B%5D=facets.brand%255B%255D%3DLGC&p%5B%5D=facets.brand%255B%255D%3DQuttos&sid=2oq%2Fc1r&otracker=nmenu_sub_Women_0_New%20arrivals%20!");
	}

	@Test
	public void clickOnUnder499() {
		mainPage.clickOnWomen();
		mainPage.clickOnUnder499();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-clothing/pr?otracker=categorytree&p%5B%5D=facets.price_range.from%3DMin&p%5B%5D=facets.price_range.to%3D500&sid=2oq%2Fc1r&otracker=nmenu_sub_Women_0_Under%20499&otracker=nmenu_sub_Women_0_Under%20499");
	}

	

	@Test
	public void clickOnSandals() {
		mainPage.clickOnWomen();
		mainPage.clickOnSandals();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-footwear/~womens-sandals/pr?sid=osp,iko&otracker=nmenu_sub_Women_0_Sandals");
	}

	@Test
	public void clickOnWomenShoes() {
		mainPage.clickOnWomen();
		mainPage.clickOnWomenShoes();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-footwear/~sports-casual-shoes/pr?&sid=osp%2Ciko&otracker=nmenu_sub_Women_0_Shoes");
	}

	@Test
	public void clickOnBallerinas() {

		mainPage.clickOnWomen();
		mainPage.clickOnBallerinas();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-footwear/ballerinas/pr?sid=osp,iko,974&otracker=nmenu_sub_Women_0_Ballerinas");
	}

	@Test
	public void clickOnSlippers() {
		mainPage.clickOnWomen();
		mainPage.clickOnSlippers();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/womens-footwear/slippers-flip-flops/pr?sid=osp,iko,iz7&otracker=nmenu_sub_Women_0_Slippers%20%26%20Flip-%20Flop%27s");
	}

	

	
	@Test
	public void clickOnBeautyGrooming() {
		mainPage.clickOnWomen();
		mainPage.clickOnBeautyGrooming();
		assertEquals(driver.getCurrentUrl().toString(),
				"https://www.flipkart.com/beauty-and-grooming/pr?sid=g9b&p[]=facets.serviceability%5B%5D%3Dtrue&otracker=categorytree&otracker=nmenu_sub_Women_0_Beauty%20%26%20Grooming");
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
