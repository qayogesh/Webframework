package com.automation.mercuryTours.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "userName")
	@CacheLookup
	private WebElement username;

	@FindBy(name = "password")
	@CacheLookup
	private WebElement password;

	@FindBy(xpath = "//a[text()='SIGN-OFF']")
	@CacheLookup
	private WebElement signOff;

	@FindBy(xpath = "//input[@value='Login' or @name='login']")
	@CacheLookup
	private WebElement submit;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignOff() {
		return signOff;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
