package tests;

import org.testng.annotations.Test;

import core.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;

public class HomePageTest extends BaseTest{
	@Test
	public void testHomePage() {
		LoginPage loginPage = new LoginPage(getDriver());
		DashboardPage homePage = new DashboardPage(getDriver());
		
		homePage = loginPage.loginTo();
//		homePage.checkForCrushing();
	}
}
