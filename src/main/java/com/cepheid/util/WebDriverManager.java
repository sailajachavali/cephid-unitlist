
package com.cepheid.util;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * @author Mounika
 * 
 * This class contains all the code to instantiate different browsers.
 * This can be further extended to support different drivers for each OS.
 * Also this can be used as utility class to create reusable functions.
 * 
 */

public class WebDriverManager {

	public WebDriver driver;

	protected static String getFilePath(String folderName, String fileName) {
		return System.getProperty("user.dir") + File.separator + folderName + File.separator + fileName;
	}



	public WebDriver setUp(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			// Chrome
			System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/windows/chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		} else if (browser.equalsIgnoreCase("firefox")) {
			// Firefox
			System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/mac/geckodriver");
			driver = new FirefoxDriver();
			return driver;

		} else if (browser.equalsIgnoreCase("safari")) {
			// Safari
			System.setProperty("webdriver.safari.driver", "src/main/resources/drivers/mac/safaridriver");
			driver = new SafariDriver();
			return driver;

		} else if (browser.equalsIgnoreCase("edge")) {
			// Edge
			System.setProperty("webdriver.edge.driver", "src/main/resources/drivers/mac/msedgedriver");
			driver = new EdgeDriver();
			return driver;

		} else {
			// default browser Chrome
			System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/windows/chromedriver");
			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			return driver;

		}

	}

	public WebElement waitForElement(WebElement element) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}

	public void back() {
		driver.navigate().back();
	}
//sleep used in this section to give some time to the user before the application quits.
	public void tearDown() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
