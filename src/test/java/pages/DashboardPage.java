package pages;

import org.openqa.selenium.By;
 

import core.BasePage;
 
import io.appium.java_client.AppiumDriver;
 

public class DashboardPage extends BasePage {

	public DashboardPage(AppiumDriver driver) {
		super(driver);
	}

	

	private String textLoveMusic = "Bạn là người yêu âm nhạc?";
	private String textPhoneAddiction = "Bạn có nghiện điện thoại không?";
	
	private By btnAddMarco = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.view.ViewGroup");
	private By btnActionBlock = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[4]/android.view.ViewGroup");
	
	public AddMarcoPage toMacroPage() {
		actionsKeyword.click(btnAddMarco);	
		return new AddMarcoPage(this.driver);
	}
	
	public ActionBlockPage toActionBlockPage() {
		actionsKeyword.click(btnActionBlock);	
		return new ActionBlockPage(this.driver);
	}
	

 

}
