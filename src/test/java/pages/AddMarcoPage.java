package pages;
import org.openqa.selenium.By;
 

import core.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
 


 

public class AddMarcoPage extends BasePage {

	public AddMarcoPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
	 private String textLogging = "Logging";
	// private String variableName = "Test Case";

	 private By btnAddTrigger = By.id("com.arlosoft.macrodroid:id/edit_macro_addTriggerButton");
	 private By btnAddMarco = By.xpath("//*[@text = 'Applications']");
	 private By btnRemove = By.xpath("//*[@text = 'App Install/Remove/Update']");
	 private By btnapplicationRemove =By.xpath("//*[@text = 'Application Removed']");
	 private By btnOK = By.id("android:id/button1");
	 private By btnAnyApplication  =By.xpath("//*[@text = 'Any Application']");
	 
	 private By btnAddAcions = By.id("com.arlosoft.macrodroid:id/edit_macro_addActionButton");
	
	 private By btnClearLog  =By.xpath("//*[@text = 'Clear Log']");
	 private By btnSystemLog =By.xpath("//*[@text = 'System Log']");
	 
	 private By btnAddContraints = By.id("com.arlosoft.macrodroid:id/edit_macro_addConstraintButton");
	 private By btnDeviceState  =By.xpath("//*[@text = 'Device State']");
	 private By btnAirplaneMode =By.xpath("//*[@text = 'Airplane Mode']");
	 private By btnAirplaneModeDisable =By.xpath("//*[@text = 'Airplane Mode Disabled']");
	 
	 private By localVariables = By.id("com.arlosoft.macrodroid:id/localVarsLabel");
	 private By addVariables = By.id("com.arlosoft.macrodroid:id/addVariableButton");
	 private By boxNameVariable = By.id("com.arlosoft.macrodroid:id/variable_new_variable_dialog_name");
	 private By variableType = By.id("android:id/text1");
	 private By integerType =By.xpath("//*[@text = 'Integer']");
	 private By btnOkVariable = By.id("com.arlosoft.macrodroid:id/okButton"); 
	 private By varTestCase = By.xpath("//*[@text = 'Test Case']");
	 private By valueBox = By.id("com.arlosoft.macrodroid:id/enter_variable_dialog_value");
	 
	 public void changeApplication() {
		 actionsKeyword.click(btnAddTrigger);
		 actionsKeyword.click(btnAddMarco);
		 actionsKeyword.click(btnRemove);
		 actionsKeyword.click(btnapplicationRemove);
		 actionsKeyword.click(btnOK);
		 actionsKeyword.click(btnAnyApplication);
		 actionsKeyword.click(btnOK);		 
	 }
	 public void changeAtion() {
		 actionsKeyword.click(btnAddAcions);
		  // Scroll to Logging
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
					+ textLogging + "\").instance(0))")).click();
		 // tap on clear log
		 actionsKeyword.click(btnClearLog);
		 //Tap on System Log
		 actionsKeyword.click(btnSystemLog);
		 // Click ok
		 actionsKeyword.click(btnOK);			 
	 }
	 
	 public void changeConstraints() {
		 actionsKeyword.click(btnAddContraints);
		  // Scroll to Logging
		  
		 // tap on   Device State
		 actionsKeyword.click(btnDeviceState);
		 //Tap on   Airplane Mode
		 actionsKeyword.click(btnAirplaneMode);
		 // Click  Airplane Mode Disable
		 actionsKeyword.click(btnAirplaneModeDisable);	
		 // Click ok
		 actionsKeyword.click(btnOK);	
	 }
	 
	 public void addLocalVariables(String variableName ) {
		 // Tap on Local Variables
		 actionsKeyword.click(localVariables);
		 //Tap on add Variables
		 actionsKeyword.click(addVariables);
		 
		 // set variable Name
		 actionsKeyword.waitForElementToClickable(boxNameVariable);
		 actionsKeyword.setName(boxNameVariable, variableName);
		 
		 // set variable type
		 actionsKeyword.click(variableType);
		 actionsKeyword.click(integerType);
		 // tap on ok
		 actionsKeyword.click(btnOkVariable);
		 
		 // Tap On Test Case Variable
		 actionsKeyword.click(varTestCase);
		 
		 // set value of Test Case Variable
		 actionsKeyword.waitForElementToClickable(valueBox);
		 actionsKeyword.setName(valueBox, "1");
		 
		 // tap on ok
		 actionsKeyword.click(btnOkVariable);
		 
		 
	 }
	 
	 
	 

}
