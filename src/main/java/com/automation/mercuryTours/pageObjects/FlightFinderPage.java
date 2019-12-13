package com.automation.mercuryTours.pageObjects;

import static org.testng.Assert.assertThrows;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderPage {
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public FlightFinderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// flight details
	@FindBy(xpath = "//input[@value='roundtrip']")
	private WebElement roundTripRadioButton;

	@FindBy(xpath = "//input[@value='oneway']")
	private WebElement oneWayRadioButton;

	@FindBy(xpath = "//select[@name='passCount']")
	private WebElement passengerCountDropDown;

	@FindBy(xpath = "//select[@name='fromPort']")
	private WebElement departingFromDropDown;

	@FindBy(xpath = "//select[@name='fromMonth']")
	private WebElement fromMonthDropDown;

	@FindBy(xpath = "//select[@name='fromDay']")
	private WebElement fromDayDropDown;

	@FindBy(xpath = "//select[@name='toPort']")
	private WebElement toPortDropDown;

	@FindBy(xpath = "//select[@name='toMonth']")
	private WebElement toMonthDropDown;

	@FindBy(xpath = "//select[@name='toDay']")
	private WebElement toDayDropDown;

	// preferences
	@FindBy(xpath = "//input[@value='Coach']")
	private WebElement economyClassRadioButton;

	@FindBy(xpath = "//input[@value='Business']")
	private WebElement businessClassRadioButton;

	@FindBy(xpath = "//input[@value='First']")
	private WebElement firstClassRadioButton;

	@FindBy(xpath = "//select[@name='airline']")
	private WebElement airlineDropDown;

	@FindBy(xpath = "//input[@name='findFlights']")
	private WebElement continueButton;

	public WebElement getRoundTripRadioButton() {
		return roundTripRadioButton;
	}

	public WebElement getOneWayRadioButton() {
		return oneWayRadioButton;
	}

	public WebElement getPassengerCountDropDown() {
		return passengerCountDropDown;
	}

	public WebElement getDepartingFromDropDown() {
		return departingFromDropDown;
	}

	public WebElement getFromMonthDropDown() {
		return fromMonthDropDown;
	}

	public WebElement getFromDayDropDown() {
		return fromDayDropDown;
	}

	public WebElement getToPortDropDown() {
		return toPortDropDown;
	}

	public WebElement getToMonthDropDown() {
		return toMonthDropDown;
	}

	public WebElement getToDayDropDown() {
		return toDayDropDown;
	}

	public WebElement getEconomyClassRadioButton() {
		return economyClassRadioButton;
	}

	public WebElement getBusinessClassRadioButton() {
		return businessClassRadioButton;
	}

	public WebElement getFirstClassRadioButton() {
		return firstClassRadioButton;
	}

	public WebElement getAirlineDropDown() {
		return airlineDropDown;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public void selectDropDown(String str, WebElement element) {
		Select select = new Select(element);
		select.deselectByValue(str);
	}

}
