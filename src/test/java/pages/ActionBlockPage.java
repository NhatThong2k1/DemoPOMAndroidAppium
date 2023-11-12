package pages;
import org.openqa.selenium.By;


import core.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
 


public class ActionBlockPage extends BasePage {

	public ActionBlockPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private String valueNameActionBlock1 = "Block Action";
	private String valueDescriptionActionBlock1 = "Description Block Action";
	private String nameVariable1 = "nameOfVariable";
	private String textLogging = "Logging";
	private String outputName = "Outputtttttt";
	private String newValueVar1 = "This is a testing string";
	
	private By btnAdd = By.id("com.arlosoft.macrodroid:id/fab");
	private By inputActionBlockName = By.id("com.arlosoft.macrodroid:id/actionBlockNameText");
	private By inputDescription = By.id("com.arlosoft.macrodroid:id/description");
	
	private By btnAddNewVariable = By.id("com.arlosoft.macrodroid:id/addInputVariableButton");
	private By inputNameVariable = By.id("com.arlosoft.macrodroid:id/variable_new_variable_dialog_name");
	private By typeVariable = By.id("android:id/text1");
	private By btnOk = By.id("com.arlosoft.macrodroid:id/okButton"); //com.arlosoft.macrodroid:id/okButton
	
	private By btnExpandInput = By.id("com.arlosoft.macrodroid:id/inputCollapseExpandButton");
	private By entryDetail = By.id("com.arlosoft.macrodroid:id/macro_edit_entry_detail");
	private By btnTrueRadio = By.id("com.arlosoft.macrodroid:id/trueRadio");
	
	private By btnAddActions = By.id("com.arlosoft.macrodroid:id/addActionButton");
//	private By btnLogging  =By.xpath("//*[@text = 'Logging']");
//	private By btnClearLog  =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout");
//	private By btnSystemLog  =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
	 private By btnClearLog  =By.xpath("//*[@text = 'Clear Log']");
	 private By btnSystemLog =By.xpath("//*[@text = 'System Log']");
	private By btnClearLogOk = By.id("android:id/button1");
	
	private By btnAddOutputName = By.id("com.arlosoft.macrodroid:id/addOutputVariableButton");
	private By bxOutputName = By.id("com.arlosoft.macrodroid:id/variable_new_variable_dialog_name");
	
//	private By variable1 = By.xpath("//*[@text = '" + nameVariable + "']");
	private By bxVariable1 = By.id("com.arlosoft.macrodroid:id/variable_name");		
	
	private By variableName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[2]");
	private By variableEntry = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[3]");
	private By actionName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[1]");
	private By actionSystemLog = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[2]");
	
	private By acceptAddAction = By.id("com.arlosoft.macrodroid:id/acceptButton");
	
	
//	private By actionBlockName = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
//	private By actionDescription = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]");
	
	private By actionBlockName = By.xpath("//androidx.recyclerview.widget.RecyclerView//android.widget.TextView[1]");
	private By actionDescription = By.xpath("//androidx.recyclerview.widget.RecyclerView//android.widget.TextView[2]");
	
	
	public void addInputVariable(String valueNameActionBlock, String valueDescriptionActionBlock, String nameVariable) {
		
		// click button add Action 
		actionsKeyword.click(btnAdd);
		
		//add a action block Name		
		actionsKeyword.waitForElementToClickable(inputActionBlockName);
		actionsKeyword.setName(inputActionBlockName, valueNameActionBlock);
		
		//Add a action block description		
		actionsKeyword.waitForElementToClickable(inputDescription);
		actionsKeyword.setName(inputDescription, valueDescriptionActionBlock);
		
		//Tap on Add button variable
		actionsKeyword.click(btnAddNewVariable);
		
		//On Action Block Detail Page, Add on a input variable name
		
		actionsKeyword.waitForElementToClickable(inputNameVariable);
		actionsKeyword.setName(inputNameVariable, nameVariable);
		
		//Boolean and click oke
		
		actionsKeyword.waitForElementToAppear(typeVariable);
		actionsKeyword.click(btnOk);
		
		//Select the Value to True
		actionsKeyword.waitForElementToClickable(btnExpandInput).click();;
		actionsKeyword.waitForElementToClickable(entryDetail).click();
		actionsKeyword.waitForElementToClickable(btnTrueRadio).click();
		actionsKeyword.click(btnOk);
		
		//On Action Blocks Detail Page, tap on Action to add an action
	}
	public void addNewActions(String textLogging) throws InterruptedException {
		actionsKeyword.click(btnAddActions);
		 // Scroll to Logging
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
					+ textLogging + "\").instance(0))")).click();
		 
	 
		 
		 //Select Clear Log
		// actionsKeyword.waitForElementToAppear(btnClearLog);
		 actionsKeyword.click(btnClearLog);
	 
 
		 //Select System Log and OK
		// actionsKeyword.waitForElementToAppear(btnSystemLog);
		 actionsKeyword.click(btnSystemLog);
		 actionsKeyword.click(btnClearLogOk);
		 
	}
	public void addOuputVariable(String nameVariable, String newValueVar1, String outputName ) {
		 
		 //On Action Block Detail Page, Add on a out variable name
	//	 actionsKeyword.waitForElementToClickable(btnAddOutputName).click();
		 actionsKeyword.click(btnAddOutputName);
	//	 actionsKeyword.waitForElementToClickable(bxOutputName);
		 actionsKeyword.click(bxOutputName);
		 actionsKeyword.setName(bxOutputName, outputName);
		 //Add String value and ok
		 actionsKeyword.click(btnOk);
		  By variable1 = By.xpath("//*[@text = '" + nameVariable + "']");	 
		 //Select new added input variable
		 actionsKeyword.click(variable1);
		
		 actionsKeyword.waitForElementToAppear(bxVariable1).click();
		 actionsKeyword.setName(bxVariable1, newValueVar1);
		 actionsKeyword.click(btnOk);
		 
		 //Verify information display in Action Block detail page
		 actionsKeyword.verifyInforDisplay(variableName, newValueVar1);
		 actionsKeyword.verifyInforDisplay(variableEntry,"Default: True");
		 actionsKeyword.verifyInforDisplay(actionName,"Clear Log");
		 actionsKeyword.verifyInforDisplay(actionSystemLog,"System Log");
		
		 //Tap on “V” button to add the action block
		 actionsKeyword.click(acceptAddAction);
		 
		 //In Action Block Page, verify the block name and action block description
//		 
	//	 actionsKeyword.verifyInforDisplay(actionBlockName, valueNameActionBlock);
	//	 actionsKeyword.verifyInforDisplay(actionDescription, valueDescriptionActionBlock);
		
		 
	}

}
