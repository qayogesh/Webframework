package com.automation.mercuryTours.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlightPage {

	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public BookAFlightPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Summary
	@FindBy(xpath = "//td[@class='frame_header_info']/b/font[contains(text(), '%s')]")
	private WebElement departingCities;

	@FindBy(xpath = "//td[@class='data_left']/b/font[contains(text(), '%s')]")
	private WebElement returningCities;

	@FindBy(xpath = "//td[@class='frame_header_info']/b/font[contains(text(), '%s')]")
	private WebElement departureDate;

	@FindBy(xpath = "//td[@class='data_center_mono']/b/font[contains(text(), '%s')]")
	private WebElement returningDate;

	@FindBy(xpath = "//td[@class='data_left']/font/b[contains(text(), '%s')]")
	private WebElement departureAirline;

	@FindBy(xpath = "//table//tr[3]//td[@class='data_center_mono']/font[contains(text(), '%s')]")
	private WebElement departingAirlineClass;

	@FindBy(xpath = "//table//tr[6]//td[@class='data_center_mono']/font[contains(text(), '%s')]")
	private WebElement returningAirlineClass;

	@FindBy(xpath = "//table//tr[3]//td[@class='data_center']/font[contains(text(), '%s')]")
	private WebElement departingPrice;

	@FindBy(xpath = "//table//tr[6]//td[@class='data_center']/font[contains(text(), '%s')]")
	private WebElement returningPrice;

	@FindBy(xpath = "//table//tr[7]//td[2][@class='data_left']/font")
	private WebElement totalPassengers;

	@FindBy(xpath = "//table//tr[8]//td[2][@class='data_left']/font")
	private WebElement totalTaxes;

	@FindBy(xpath = "//table//tr[9]//td[2][@class='data_left']/font/b")
	private WebElement totalPriceAmount;

	// Passenger
	@FindBy(xpath = "//input[@name='passFirst0']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='passLast0']")
	private WebElement lastName;

	
	// Credit Card

	// Billing Address

	// Delivery Address

}
