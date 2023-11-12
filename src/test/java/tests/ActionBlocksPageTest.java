package tests;
import org.testng.annotations.Test;

import core.BaseTest;
import data.ActionBlockData;
 
import pages.DashboardPage;
import pages.ActionBlockPage;
 
import pages.LoginPage;


public class ActionBlocksPageTest extends BaseTest {

	@Test(dataProvider = "DataFromJsonFile", dataProviderClass = ActionBlockData.class)
	public void testAddActionClearLog(String valueNameActionBlock, String valueDescriptionActionBlock, String nameVariable
			, String textLogging, String outputName, String newValueVar1) throws InterruptedException {
	
		LoginPage loginPage = new LoginPage(getDriver());
		DashboardPage dashBoard = loginPage.loginTo();
		ActionBlockPage actionPage = new ActionBlockPage(getDriver());
	//	crushPage = homePage.checkForCrushing();
		
		actionPage = dashBoard.toActionBlockPage();
		actionPage.addInputVariable(valueNameActionBlock,valueDescriptionActionBlock,nameVariable );
		actionPage.addNewActions(textLogging);
		actionPage.addOuputVariable(nameVariable, newValueVar1, outputName);
		
	}
}
