package com.mindtree.ReusableComponent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebdriverHelper {
	public static WebDriver driver;

	public static void LaunchingBrowser() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\config.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");

			driver = new FirefoxDriver();
		} else  if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", ".\\driver\\IEDriver.exe");

			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static WebDriver getDriver() {
		return driver;
	}
}




