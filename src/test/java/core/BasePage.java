package core;

import java.time.Duration;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;

public class BasePage {
 

	public AppiumDriver driver;
	public WebDriverWait wait;
	public ActionKeyword actionsKeyword;
	 
	public BasePage(AppiumDriver driver) {
		super();
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(300),Duration.ofSeconds(2));
		this.actionsKeyword = new ActionKeyword(driver);
 
	}
 
}
