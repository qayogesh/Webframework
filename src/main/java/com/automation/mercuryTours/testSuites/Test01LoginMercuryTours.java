package com.automation.mercuryTours.testSuites;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.mercuryTours.driverFactory.DriverFactory;
import com.automation.mercuryTours.pageObjects.LoginPage;
import com.automation.mercuryTours.utils.ReadConfig;
import com.automation.mercuryTours.utils.ReadExcel;


public class Test01LoginMercuryTours extends DriverFactory {
	WebDriver driver;
	LoginPage loginPage;

	public static final String SIGNOFF = "SIGN-OFF";

	@DataProvider
	public String[][] getTestData() throws IOException {
		ReadExcel read = new ReadExcel();
		return read.getData("C:\\Projects\\webFramework\\src\\main\\java\\resources\\dataSheets\\testData_Login.xlsx", "Sheet1");
	}
	
	@BeforeMethod
	public void setUp() {
		driver = DriverFactory.getInstance("CHROME");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Test(dataProvider = "getTestData")
	public void loginTest(String usernameData, String passwordData) throws InterruptedException, FileNotFoundException, IOException, ParseException {
		loginPage = new LoginPage(driver);
		driver.get(ReadConfig.getConfig("url"));
		loginPage.getUsername().sendKeys(usernameData);
		loginPage.getPassword().sendKeys(passwordData);
		loginPage.getSubmit().click();
		Assert.assertEquals(SIGNOFF, loginPage.getSignOff().getText());
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
