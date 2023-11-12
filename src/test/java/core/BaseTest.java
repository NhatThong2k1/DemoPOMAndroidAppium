package core;

import java.net.MalformedURLException;
import java.net.URL;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	private AppiumDriver driver;
	
	private String filePath = "C:\\Users\\Kythu\\Desktop\\AUT_JAVA\\appAndroidTest\\Final_Exam_MacroDroid.apk";
	//"C:\Users\Kythu\Desktop\AUT_JAVA\appAndroidTest\Final_Exam_MacroDroid.apk"
	 
	private String deviceName = "emulator-5554";
	private String platformName = "Android";
	private String platformVersion = "14";
	
	private String serverIp = "127.0.0.1";
	private int appiumPort = 4723;
	
	@BeforeMethod
	public void setup() {
		initDriver();
	}

	public AppiumDriver getDriver() {
		return driver;
	}

	private void initDriver() {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.APP, filePath);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability("appPackage", "com.arlosoft.macrodroid");
		cap.setCapability("appWaitActivity","com.arlosoft.macrodroid.intro.IntroActivity");

		cap.setCapability("autoGrantPermissions", true);
		
		String serverUrl = "http://" + serverIp + ":" + appiumPort + "/wd/hub";

		try {
			System.out.println("Argument to driver object : " + serverUrl);
			driver = new AppiumDriver(new URL(serverUrl), cap);

		} catch (NullPointerException | MalformedURLException ex) {
			throw new RuntimeException("Appium driver could not be initialised for device ");
		}
//		System.out.println("Driver in initdriver is : " + driver);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
