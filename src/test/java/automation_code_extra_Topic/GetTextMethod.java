package automation_code_extra_Topic;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetTextMethod {
	public static WebDriver driver;
	public static ChromeOptions options;
	public static SoftAssert softassert;

	@Test
	public void wrongPasswordLogin() throws Exception {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");

		options.addArguments("--incognito");

		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));

		driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@1234");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualWarningMessage = driver.findElement(By.xpath("//div[@class = 'alert alert-danger alert-dismissible']"))
				.getText();
		System.out.println("Actual Warning Message is:" + actualWarningMessage);

		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		System.out.println("Expected Warning Message is:" + expectedWarningMessage);

		softassert.assertEquals(actualWarningMessage,expectedWarningMessage);
		softassert.assertAll();
	}

}
