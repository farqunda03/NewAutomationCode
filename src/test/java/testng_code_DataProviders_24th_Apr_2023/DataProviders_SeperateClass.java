package testng_code_DataProviders_24th_Apr_2023;

import org.testng.annotations.DataProvider;

public class DataProviders_SeperateClass {

	@DataProvider(name = "Rediff")

	public static Object[][] getRediffData() {
		Object[][] data = { { "seleniumpanda@rediffmail.com", "Selenium@123" },
				{ "seleniumpanda1@rediffmail.com", "Donkey@123" } };

		return data;
	}

	@DataProvider(name = "TN")

	public static Object[][] getTNData() {
		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" },
				{ "seleniumpanda1@gmail.com", "Selenium@123" }, { "seleniumpanda2@gmail.com", "Selenium@123" },
				{ "seleniumpanda3@gmail.com", "Selenium@123" }, { "seleniumpanda4@gmail.com", "Selenium@1234" } };

		return data;
	}
}
