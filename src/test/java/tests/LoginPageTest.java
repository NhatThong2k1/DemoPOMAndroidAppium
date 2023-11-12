package tests;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import core.BaseTest;
import pages.LoginPage;

public class LoginPageTest extends BaseTest{
	@Test
	public void testLoginPage() throws MalformedURLException, InterruptedException {
		LoginPage loginPage = new LoginPage(getDriver());
	//	loginPage.clickLoginAndChoiceVietnamese();
	}
}
