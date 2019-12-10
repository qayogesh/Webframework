package com.automation.mercuryTours.driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	public static WebDriver driver;

	public static WebDriver getInstance(String browserName) {
		if (browserName.toUpperCase() == "CHROME") {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Projects\\webFramework\\src\\main\\java\\resources\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.toUpperCase() == "IE") {
			System.setProperty("webdriver.ie.driver", "C:\\Projects\\webFramework\\src\\main\\java\\resources\\browsers\\iexplore.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

}
