package tests;

import org.testng.annotations.Test;

import core.BaseTest;

import data.AddMarcoData;
import pages.DashboardPage;
import pages.AddMarcoPage;

import pages.LoginPage;



public class AddMarcoPageTest extends BaseTest {

	@Test(dataProvider = "DataFromJsonFile", dataProviderClass = AddMarcoData.class)
	public void testMarcoPage(String variableName) {

		LoginPage loginPage = new LoginPage(getDriver());
		DashboardPage dashBoard = loginPage.loginTo();
		AddMarcoPage marcoPage = new AddMarcoPage(getDriver());

		marcoPage = dashBoard.toMacroPage();

		marcoPage.changeApplication();
		marcoPage.changeAtion();
		marcoPage.changeConstraints();
		marcoPage.addLocalVariables(variableName);

	}
}
