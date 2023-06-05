package cromeOptions_4th_May_2023;

import java.util.Arrays;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class COptions {

	public static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		// PageLoadStrategy

		options.setPageLoadStrategy(PageLoadStrategy.EAGER);

		options.addArguments("--start-maximized");
		
		options.addArguments("--incognito");

		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));

		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");

	}

}
