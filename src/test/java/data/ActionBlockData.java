package data;

import core.helper.JsonHelper;
import org.testng.annotations.DataProvider;

public class ActionBlockData {
	@DataProvider(name = "DataFromJsonFile")
    public Object[][] dataFromJsonFile() {
     return  JsonHelper.ReadJsonFromFile("C:\\Users\\Kythu\\eclipse-workspace\\POMMarcoAndroid\\src\\main\\resources\\testData.json");
		//return JsonHelper.ReadJsonFromFile("C:\\Users\\Kythu\\eclipse-workspace\\POMMarcoAndroid\\src\\main\\resources\\testData.json");
    }
}
