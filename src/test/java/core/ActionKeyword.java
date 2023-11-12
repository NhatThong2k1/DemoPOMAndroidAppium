package core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;

public class ActionKeyword {
	public AppiumDriver driver;
	public WebDriverWait wait;

	private int TIMEOUT = 300;
	private int POLLING = 2;

	public ActionKeyword(AppiumDriver driver) {
		super();
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT), Duration.ofSeconds(POLLING));

	}

	public WebElement waitForElementToAppear(By element) {

		return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	public WebElement waitForElementToClickable(By element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void click(By element) {
		waitForElementToClickable(element).click();
	}
	
	public String getText(By element) {
		String textOfElement = waitForElementToAppear(element).getText();
		return textOfElement;
	}
	
	public void selectLanguage(By element , int index  ) {
		waitForElementToClickable(element);
		driver.findElement(element).click();
	}
	
	public void setName(By element, String name) {
		waitForElementToClickable(element);
		driver.findElement(element).sendKeys(name);
	}
	
	public String actualResultAndBackHome(By element) {
		waitForElementToAppear(element);
		String actualScore = driver.findElement(element).getText();
		// return score after answer the question
		return actualScore;
	}
	
	
	
	public void answerTheQuestion(By element1, By element2, By element3) {
		waitForElementToClickable(element1).click();
		waitForElementToClickable(element2).click();
		waitForElementToClickable(element3).click();
		waitForElementToClickable(element1).click();
		waitForElementToClickable(element3).click();
		waitForElementToClickable(element1).click();
		waitForElementToClickable(element1).click();
		waitForElementToClickable(element2).click();
		waitForElementToClickable(element3).click();
		waitForElementToClickable(element3).click();
		
	}
	
	public void verifyInforDisplay(By element, String text) {
		String information = driver.findElement(element).getText();
		if(information.equals(text)) {
		 System.out.println("Information of "+ information + "is correct" );
		} else {
			System.out.println("Information of "+ information + "is incorrect" );
		}
		
		
	}
	
	

}
