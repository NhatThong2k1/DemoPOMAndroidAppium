package pages;

import org.openqa.selenium.By;
 

import core.BasePage;
import io.appium.java_client.AppiumDriver;
 

public class LoginPage extends BasePage {

	public LoginPage(AppiumDriver driver) {
		super(driver);
	}
	

	
	private By btnNext = By.id("com.arlosoft.macrodroid:id/button_next");
	private By btnExitQC = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");


	public DashboardPage loginTo() {
		
		actionsKeyword.click(btnNext);
//		waitForElementToAppear(btnLogin);

		actionsKeyword.click(btnNext);
		
		actionsKeyword.click(btnNext);
		
		actionsKeyword.click(btnNext);
		
		actionsKeyword.click(btnExitQC);
		
//		waitForElementToAppear(lablVietnamese);
//		driver.findElement(lablVietnamese).click();
		return new DashboardPage(this.driver);
	}
	
	 
}
