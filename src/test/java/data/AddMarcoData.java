package data;

import core.helper.JsonHelper;
import org.testng.annotations.DataProvider;

public class AddMarcoData {
	@DataProvider(name = "DataFromJsonFile")
    public Object[][] dataFromJsonFile() {
     return  JsonHelper.ReadJsonFromFile("C:\\Users\\Kythu\\eclipse-workspace\\POMMarcoAndroid\\src\\main\\resources\\dataMarco.json");
		//return JsonHelper.ReadJsonFromFile("C:\\Users\\Kythu\\eclipse-workspace\\POMMarcoAndroid\\src\\main\\resources\\testData.json");
    }
}
