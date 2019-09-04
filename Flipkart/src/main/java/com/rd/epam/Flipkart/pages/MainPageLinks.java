package com.rd.epam.Flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPageLinks {

	WebDriver driver;

	public MainPageLinks(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//button[@class='_2AkmmA _29YdH8']")
	WebElement popupHandler;

	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Electronics')]")
	WebElement electronics;
	@FindBy(how = How.XPATH, using = "//a[@title='Mobiles']")
	WebElement mobiles;

	@FindBy(how = How.XPATH, using = "//a[@title='Mobile Accessories']")
	WebElement mobileAccessories;

	@FindBy(how = How.XPATH, using = "//a[@title='Health Care Appliances']")
	WebElement healthCareAppliances;
	@FindBy(how = How.XPATH, using = "//a[@title='Smart Wearable Tech']")
	WebElement smartWearableTech;
	@FindBy(how = How.XPATH, using = "//a[@title='Televisions']")
	WebElement television;
	@FindBy(how = How.XPATH, using = "//a[@title='Laptops']")
	WebElement laptops;
	@FindBy(how = How.XPATH, using = "//a[@title='Desktop PCs']")
	WebElement desktopPCS;
	@FindBy(how = How.XPATH, using = "//a[@title='Gaming & Accessories']")
	WebElement gamesAndAccessories;
	@FindBy(how = How.XPATH, using = "//a[@title='Computer Accessories']")
	WebElement computerAccessories;
	@FindBy(how = How.XPATH, using = "//a[@title='Computer Peripherals']")
	WebElement computerPeripherals;
	@FindBy(how = How.XPATH, using = "//a[@title='Tablets']")
	WebElement tablets;
	@FindBy(how = How.XPATH, using = "//a[@title='Speakers']")
	WebElement speakers;
	@FindBy(how = How.XPATH, using = "//a[@title='Smart Home Automation']")
	WebElement smartHomeAutomation;
	@FindBy(how = How.XPATH, using = "//a[@title='Camera']")
	WebElement camera;
	@FindBy(how = How.XPATH, using = "//a[@title='Camera Accessories']")
	WebElement cameraAccessories;
	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'TVs & Appliances')]")
	WebElement tVsAppliances;
	@FindBy(how = How.XPATH, using = "//a[@title='Android TVs']")
	WebElement androidTVs;
	@FindBy(how = How.XPATH, using = "//a[@title='Smart & Ultra HD']")
	WebElement smartUltraHD;
	@FindBy(how = How.XPATH, using = "//a[@title='Washing Machine']")
	WebElement washingMachine;
	@FindBy(how = How.XPATH, using = "//a[@title='Air Conditioners']")
	WebElement airConditioners;
	@FindBy(how = How.XPATH, using = "//a[@title='Refrigerators']")
	WebElement refrigerators;
	@FindBy(how = How.XPATH, using = "//a[@title='Kitchen Appliances']")
	WebElement kitchenAppliances;
	@FindBy(how = How.XPATH, using = "//a[@title='Healthy Living Appliances']")
	WebElement healthyLivingAppliances;
	@FindBy(how = How.XPATH, using = "//a[@title='Small Home Appliances']")
	WebElement smallHomeAppliances;
	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Men')]")
	WebElement men;
	@FindBy(how = How.XPATH, using = "//a[@title='Footwear']")
	WebElement footwear;
	@FindBy(how = How.XPATH, using = "//a[@title=\"Men's Grooming\"]")
	WebElement mensGrooming;
	@FindBy(how = How.XPATH, using = "//a[@title='Clothing']")
	WebElement clothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Top wear']")
	WebElement topWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Bottom wear']")
	WebElement bottomWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Ties, Socks, Caps & more']")
	WebElement tiesSocksCapsmore;
	@FindBy(how = How.XPATH, using = "//a[@title='Kurta, Pyjama & more']")
	WebElement kurtaPyjamamore;
	@FindBy(how = How.XPATH, using = "//a[@title='Fabrics']")
	WebElement fabrics;
	@FindBy(how = How.XPATH, using = "//a[@title='Seasonal Wear']")
	WebElement seasonalWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Sports wear']")
	WebElement sportsWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Innerwear & Sleepwear']")
	WebElement innerwearSleepwear;
	@FindBy(how = How.XPATH, using = "//a[@title='Watches']")
	WebElement watches;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Sports & Fitness Store')]")
	WebElement sportsFitnessStore;
	@FindBy(how = How.XPATH, using = "//a[@title='Accessories']")
	WebElement accessories;
	@FindBy(how = How.XPATH, using = "//a[@title='Smart Watches']")
	WebElement smartWatches;
	@FindBy(how = How.XPATH, using = "//a[@title='Smart Bands']")
	WebElement smartBands;
	@FindBy(how = How.XPATH, using = "//a[@title='Personal Care Appliances']")
	WebElement personalCareAppliances;
	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Women')]")
	WebElement women;
	@FindBy(how = How.XPATH, using = "//a[@title='Clothing']")
	WebElement womenClothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Western Wear']")
	WebElement westernWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Swim & Beachwear']")
	WebElement swimBeech;
	@FindBy(how = How.XPATH, using = "//a[@title='Winter & Seasonal Wear']")
	WebElement winterSeasonalWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Party Dresses']")
	WebElement partyDresses;
	@FindBy(how = How.XPATH, using = "//a[@title='Ethnic Wear']")
	WebElement ethnicWear;
	@FindBy(how = How.XPATH, using = "//a[@title='International Brands']")
	WebElement internationalBrands;
	@FindBy(how = How.XPATH, using = "//a[@title='Sports wear']")
	WebElement womenSportsWear;
	@FindBy(how = How.XPATH, using = "//a[@title='New arrivals !']")
	WebElement newArrivals;
	@FindBy(how = How.XPATH, using = "//a[@title='Under 499']")
	WebElement under499;
	@FindBy(how = How.XPATH, using = "//a[@title='Footwear']")
	WebElement womenFootwear;
	@FindBy(how = How.XPATH, using = "//a[@title='Sandals']")
	WebElement sandals;
	@FindBy(how = How.XPATH, using = "//a[@title='Shoes']")
	WebElement womenShoes;
	@FindBy(how = How.XPATH, using = "//a[@title='Ballerinas']")
	WebElement ballerinas;
	@FindBy(how = How.XPATH, using = "//a[@title=\"Slippers & Flip- Flop's\"]")
	WebElement slippers;
	@FindBy(how = How.XPATH, using = "//a[@title='Smart Watches']")
	WebElement womenSmartWatches;
	@FindBy(how = How.XPATH, using = "//a[@title='Personal Care Appliances']")
	WebElement personalCare;
	@FindBy(how = How.XPATH, using = "//a[@title='Beauty & Grooming']")
	WebElement beautyGrooming;
	@FindBy(how = How.XPATH, using = "//a[@title='Jewellery']")
	WebElement jewellery;
	@FindBy(how = How.XPATH, using = "//a[@title='Accessories']")
	WebElement womenAccessories;
	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Baby & Kids')]")
	WebElement babyKids;
	@FindBy(how = How.XPATH, using = "//a[@title='Kids Clothing']")
	WebElement kidsClothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Boys' Clothing']")
	WebElement boysClothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Girls' Clothing']")
	WebElement girlsClothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Baby Boy Clothing']")
	WebElement babyBoyClothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Baby Girl Clothing']")
	WebElement babyGirlClothing;
	@FindBy(how = How.XPATH, using = "//a[@title='Kids Footwear']")
	WebElement kidsFootwear;
	@FindBy(how = How.XPATH, using = "//a[@title='Boys' Footwear']")
	WebElement boysFootwear;
	@FindBy(how = How.XPATH, using = "//a[@title='Girls' Footwear']")
	WebElement girlsFootwear;
	@FindBy(how = How.XPATH, using = "//a[@title='Baby Footwear']")
	WebElement babyFootwear;
	@FindBy(how = How.XPATH, using = "//a[@title='Character Shoes']")
	WebElement characterShoes;
	@FindBy(how = How.XPATH, using = "//a[@title='Kids Winter Wear']")
	WebElement kidsWinterWear;
	@FindBy(how = How.XPATH, using = "//a[@title='Toys']")
	WebElement toys;
	@FindBy(how = How.XPATH, using = "//a[@title='School Supplies']")
	WebElement schoolSupplies;
	@FindBy(how = How.XPATH, using = "//a[@title='Baby Care']")
	WebElement babyCare;
	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Home & Furniture')]")
	WebElement homeFurniture;
	@FindBy(how = How.XPATH, using = "//a[@title='Kitchen, Cookware & Serveware']")
	WebElement kitchenCookwareServeware;
	@FindBy(how = How.XPATH, using = "//a[@title='Tableware & Dinnerware']")
	WebElement tablewareDinnerware;
	@FindBy(how = How.XPATH, using = "//a[@title='Kitchen Storage']")
	WebElement kitchenStorage;

	@FindBy(how = How.XPATH, using = "//a[@title='Cleaning Supplies']")
	WebElement cleaningSupplies;

	@FindBy(how = How.XPATH, using = "//a[@title='Furniture']")
	WebElement furniture;

	@FindBy(how = How.XPATH, using = "//a[@title='Offers on Furniture']")
	WebElement offersonFurniture;

	@FindBy(how = How.XPATH, using = "//a[@title='Furniture Top Offers']")
	WebElement furnitureTopOffers;

	@FindBy(how = How.XPATH, using = "//a[@title='Furnishing']")
	WebElement furnishing;
	@FindBy(how = How.XPATH, using = "//a[@title='Smart Home Automation']")
	WebElement furnitureSmartHomeAutomation;
	@FindBy(how = How.XPATH, using = "//a[@title='Home Improvement']")
	WebElement homeImprovement;
	@FindBy(how = How.XPATH, using = "//a[@title='Home Decor']")
	WebElement homeDecor;
	@FindBy(how = How.XPATH, using = "//a[@title='Home Lighting']")
	WebElement homeLighting;
	@FindBy(how = How.XPATH, using = "//a[@title='Festive Decor & Gifts']")
	WebElement festiveDecorGifts;
	@FindBy(how = How.XPATH, using = "//a[@title='Pet Supplies']")
	WebElement petSupplies;
	@FindBy(how = How.XPATH, using = "//a[@title='Durability Certified Furniture']")
	WebElement durabilityCertifiedFurniture;
	@FindBy(how = How.XPATH, using = "//a[@title='Rakhi & Rakhi Gifts']")
	WebElement rakhiRakhiGifts;
	@FindBy(how = How.XPATH, using = "//a[@title='Gardening Store']")
	WebElement gardeningStore;
	@FindBy(how = How.XPATH, using = "//a[@title='Perfect Home Store']")
	WebElement perfectHomeStore;

	@FindBy(how = How.XPATH, using = "//span[@class='_1QZ6fC _3Lgyp8' and contains(text(),'Sports, Books & More')]")
	WebElement sportsBooksMore;

	@FindBy(how = How.XPATH, using = "//a[@title='Food Essentials']")
	WebElement foodEssentials;
	@FindBy(how = How.XPATH, using = "//a[@title='Books']")
	WebElement books;
	@FindBy(how = How.XPATH, using = "//a[@title='Sports']")
	WebElement sports;
	@FindBy(how = How.XPATH, using = "//a[@title='Stationery']")
	WebElement stationery;
	@FindBy(how = How.XPATH, using = "//a[@title='Grocery (Only in Select Cities)']")
	WebElement groceryOnlyinCities;

	public void closePopUP() {
		popupHandler.click();
	}

	public void clickOnMobile() {
		mobiles.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnMobileAccessories() {
		mobileAccessories.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSmartWearableTech() {
		smartWearableTech.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnHealthCareAppliances() {
		healthCareAppliances.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnLaptops() {
		laptops.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnDesktopPCS() {
		desktopPCS.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnGamesAndAccessories() {
		gamesAndAccessories.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnComputerAccessories() {
		computerAccessories.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnComputerPeripherals() {
		computerPeripherals.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnTablets() {
		tablets.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSpeakers() {
		speakers.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSmartHomeAutomation() {
		smartHomeAutomation.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnCamera() {
		camera.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnCameraAccessories() {
		cameraAccessories.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnTVsAppliances() {
		tVsAppliances.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnTelevision() {
		television.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnAndroidTVs() {
		androidTVs.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSmartUltraHD() {
		smartUltraHD.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnWashingMachine() {
		washingMachine.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnAirConditioners() {
		airConditioners.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnRefrigerators() {
		refrigerators.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnKitchenAppliances() {
		kitchenAppliances.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnHealthyLivingAppliances() {
		healthyLivingAppliances.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSmallHomeAppliances() {
		smallHomeAppliances.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnMen() {
		men.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnFootwear() {
		footwear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnMensGrooming() {
		mensGrooming.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnClothing() {
		clothing.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnTopWear() {
		topWear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnBottomWear() {
		bottomWear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnTiesSocksCapsmore() {
		tiesSocksCapsmore.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnKurtaPyjamamore() {
		kurtaPyjamamore.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnFabrics() {
		fabrics.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSeasonalWear() {
		seasonalWear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSportsWear() {
		sportsWear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnInnerwearSleepwear() {
		innerwearSleepwear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSportsFitnessStore() {

		sportsFitnessStore.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnAccessories() {
		accessories.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSmartBands() {
		smartBands.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnPersonalCareAppliances() {
		personalCareAppliances.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnWomen() {
		women.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnWomenClothing() {
		womenClothing.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnWesternWear() {
		westernWear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSwimBeech() {
		swimBeech.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnWinterSeasonalWear() {
		winterSeasonalWear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnPartyDresses() {
		partyDresses.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnEthnicWear() {
		ethnicWear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnInternationalBrands() {
		internationalBrands.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnWomenSportsWear() {
		womenSportsWear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnNewArrivals() {
		newArrivals.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnUnder499() {
		under499.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnWomenFootwear() {
		womenFootwear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSandals() {
		sandals.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnWomenShoes() {
		womenShoes.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnBallerinas() {
		ballerinas.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSlippers() {
		slippers.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnWatches() {
		watches.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnWomenSmartWatches() {
		womenSmartWatches.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnPersonalCare() {
		personalCare.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnBeautyGrooming() {
		beautyGrooming.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnJewellery() {
		jewellery.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnWomenAccessories() {
		womenAccessories.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnBabyKids() {
		babyKids.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnKidsClothing() {
		kidsClothing.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnBoysClothing() {
		boysClothing.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnGirlsClothing() {
		girlsClothing.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnBabyBoyClothing() {
		babyBoyClothing.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void BabyGirlClothing() {
		babyGirlClothing.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnKidsFootwear() {
		kidsFootwear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnBoysFootwear() {
		boysFootwear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnGirlsFootwear() {
		girlsFootwear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnBabyFootwear() {
		babyFootwear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnCharacterShoes() {
		characterShoes.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnKidsWinterWear() {
		kidsWinterWear.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnToys() {
		toys.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSchoolSupplies() {
		schoolSupplies.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnBabyCare() {
		babyCare.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnHomeFurniture() {
		homeFurniture.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnKitchenCookwareServeware() {
		kitchenCookwareServeware.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnTablewareDinnerware() {
		tablewareDinnerware.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnKitchenStorage() {
		kitchenStorage.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnCleaningSupplies() {
		cleaningSupplies.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnFurniture() {
		furniture.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnOffersonFurniture() {
		offersonFurniture.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnFurnitureTopOffers() {
		furnitureTopOffers.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnFurnishing() {
		furnishing.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnFurnitureSmartHomeAutomation() {
		furnitureSmartHomeAutomation.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnHomeImprovement() {
		homeImprovement.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnHomeDecor() {
		homeDecor.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnHomeLighting() {
		homeLighting.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnFestiveDecorGifts() {
		festiveDecorGifts.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnPetSupplies() {
		petSupplies.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnRakhiRakhiGifts() {
		rakhiRakhiGifts.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnGardeningStore() {
		gardeningStore.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnPerfectHomeStore() {
		perfectHomeStore.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSportsBooksMore() {
		sportsBooksMore.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnFoodEssentials() {
		foodEssentials.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnBooks() {
		books.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSports() {
		sports.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnStationery() {
		stationery.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnGroceryOnlyinCities() {
		groceryOnlyinCities.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnElectronics() {
		electronics.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
