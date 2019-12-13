package com.automation.mercuryTours.testSuites;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.mercuryTours.driverFactory.DriverFactory;
import com.automation.mercuryTours.pageObjects.FlightFinderPage;
import com.automation.mercuryTours.pageObjects.LoginPage;
import com.automation.mercuryTours.pageObjects.SelectFlightPage;
import com.automation.mercuryTours.utils.ReadConfig;
import com.automation.mercuryTours.utils.ReadExcel;

public class Test02ValidateBookingRoundTripEconomy {

	private WebDriver driver;

	LoginPage loginPage;
	FlightFinderPage flightFinderPage;
	SelectFlightPage selectFlightPage;

	@DataProvider
	public String[][] getDataOneWay() throws IOException {
		ReadExcel read = new ReadExcel();
		return read.getData(
				"C:\\Projects\\webFramework\\src\\main\\java\\resources\\dataSheets\\testData_FlightBooking.xlsx",
				"FlightBookingOneWay");
	}

	@DataProvider
	public String[][] getDataRoundTrip() throws IOException {
		ReadExcel read = new ReadExcel();
		return read.getData(
				"C:\\Projects\\webFramework\\src\\main\\java\\resources\\dataSheets\\testData_FlightBooking.xlsx",
				"FlightBookingRoundTrip");
	}

	@AfterMethod
	public void teaDown() {
		driver.close();
		driver = null;
	}

	@BeforeMethod
	public void setUp() {
		driver = DriverFactory.getInstance("CHROME");
		loginPage = new LoginPage(driver);
		flightFinderPage = new FlightFinderPage(driver);
	}

	@Test(dataProvider = "getDataOneWay")
	public void validateFlightBookingOneWay(String username, String password, String tripType, String passengerCount,
			String departingCity, String DepartingMonth, String DepartingDate, String ArrivingCity,
			String ArrivingMonth, String ArrivingDate, String ServiceClass, String Airline)
			throws FileNotFoundException, IOException, ParseException {
		driver.get(ReadConfig.getConfig("url"));
		loginPage.getUsername().sendKeys(username);
		loginPage.getPassword().sendKeys(password);
		loginPage.getSubmit().click();

		//Flight Finder
		if (tripType.equalsIgnoreCase("One Way")) {
			flightFinderPage.getOneWayRadioButton().click();
		}
		Assert.assertTrue(Integer.parseInt(passengerCount) > 0);
		Assert.assertTrue(Integer.parseInt(passengerCount) < 5);
		flightFinderPage.selectDropDown(passengerCount, flightFinderPage.getPassengerCountDropDown());

		flightFinderPage.selectDropDown(departingCity, flightFinderPage.getDepartingFromDropDown());
		flightFinderPage.selectDropDown(DepartingMonth, flightFinderPage.getFromMonthDropDown());
		flightFinderPage.selectDropDown(DepartingDate, flightFinderPage.getFromDayDropDown());
		flightFinderPage.selectDropDown(ArrivingCity, flightFinderPage.getToPortDropDown());
		flightFinderPage.selectDropDown(ArrivingMonth, flightFinderPage.getToMonthDropDown());
		flightFinderPage.selectDropDown(ArrivingDate, flightFinderPage.getToDayDropDown());
		if (ServiceClass.equalsIgnoreCase("First Class")) {
			flightFinderPage.getFirstClassRadioButton().click();
		} else if (ServiceClass.equalsIgnoreCase("Business")) {
			flightFinderPage.getBusinessClassRadioButton().click();
		} else if (ServiceClass.equalsIgnoreCase("Economy")) {
			flightFinderPage.getEconomyClassRadioButton().click();
		}
		flightFinderPage.selectDropDown(Airline, flightFinderPage.getAirlineDropDown());
		flightFinderPage.getContinueButton().click();
		
		//Select Flight
		selectFlightPage.getOutFlightRadioButtons().get(3).click();
		selectFlightPage.getInFlightRadioButtons().get(3).click();
		selectFlightPage.getContinueButton().click();
		
		
		

		driver.close();
	}

}
