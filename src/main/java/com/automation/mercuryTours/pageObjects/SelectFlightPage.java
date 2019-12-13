package com.automation.mercuryTours.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectFlightPage {

	public WebDriver driver;

	public void SelectFlight(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	// DEPART
	@FindBy(xpath = "//table//td[@class='title']//font[text() = 'DEPART']")
	private WebElement titleDepart;

	@FindBy(xpath = "//td[@class='title']//font[contains(text(), '%s')]")
	private WebElement departCity;

	@FindBy(xpath = "//form[@name='results']//input[@name='outFlight']")
	private List<WebElement> outFlightRadioButtons;

	@FindBy(xpath = "//form[@name='results']//table[1]//td[@class='data_left']//b[contains(text(), 'Airlines')]")
	private List<WebElement> outFlightAirlineNamesList;

	@FindBy(xpath = "//form[@name='results']//table[1]//td[@class='data_verb_xcols']//b[contains(text(), '$')]")
	private List<WebElement> outFlightAirlinePriceList;

	@FindBy(xpath = "//form[@name='results']//table[1]//td[@class='data_center_mono']//font[contains(text(), ':')]")
	private List<WebElement> departTimeList;

	@FindBy(xpath = "//form[@name='results']//table[1]//td[@class='data_center']//font[contains(text(), 'stop')]")
	private List<WebElement> departStopList;

	// RETURN
	@FindBy(xpath = "//table//td[@class='title']//font[text() = 'RETURN']")
	private WebElement titleReturn;

	@FindBy(xpath = "//td[@class='title']//font[contains(text(), '%s')]")
	private WebElement returnCity;

	@FindBy(xpath = "//form[@name='results']//input[@name='inFlight']")
	private List<WebElement> inFlightRadioButtons;

	@FindBy(xpath = "//form[@name='results']//table[2]//td[@class='data_left']//b[contains(text(), 'Airlines')]")
	private List<WebElement> inFlightAirlineNamesList;

	@FindBy(xpath = "//form[@name='results']//table[2]//td[@class='data_verb_xcols']//b[contains(text(), '$')]")
	private List<WebElement> inFlightAirlinePriceList;

	@FindBy(xpath = "//form[@name='results']//table[2]//td[@class='data_center_mono']//font[contains(text(), ':')]")
	private List<WebElement> rnretuTimeList;

	@FindBy(xpath = "//form[@name='results']//table[2]//td[@class='data_center']//font[contains(text(), 'stop')]")
	private List<WebElement> returnStopList;

	@FindBy(xpath = "//input[@name='reserveFlights']")
	private WebElement continueButton;

	public WebElement getTitleDepart() {
		return titleDepart;
	}

	public WebElement getDepartCity() {
		return departCity;
	}

	public List<WebElement> getOutFlightRadioButtons() {
		return outFlightRadioButtons;
	}

	public List<WebElement> getOutFlightAirlineNamesList() {
		return outFlightAirlineNamesList;
	}

	public List<WebElement> getOutFlightAirlinePriceList() {
		return outFlightAirlinePriceList;
	}

	public List<WebElement> getDepartTimeList() {
		return departTimeList;
	}

	public List<WebElement> getDepartStopList() {
		return departStopList;
	}

	public WebElement getTitleReturn() {
		return titleReturn;
	}

	public WebElement getReturnCity() {
		return returnCity;
	}

	public List<WebElement> getInFlightRadioButtons() {
		return inFlightRadioButtons;
	}

	public List<WebElement> getInFlightAirlineNamesList() {
		return inFlightAirlineNamesList;
	}

	public List<WebElement> getInFlightAirlinePriceList() {
		return inFlightAirlinePriceList;
	}

	public List<WebElement> getRnretuTimeList() {
		return rnretuTimeList;
	}

	public List<WebElement> getReturnStopList() {
		return returnStopList;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

}
