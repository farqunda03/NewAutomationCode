package testng_code_DataProviders_24th_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases_SeperateClass {

	public static WebDriver driver;

	@Test(priority = 1, dataProvider = "TN", dataProviderClass = DataProviders_SeperateClass.class)
	public  static void enterTNLoginDetails(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}

	@Test(priority = 2, dataProvider = "Rediff",dataProviderClass = DataProviders_SeperateClass.class)
	public  static void enterRediffLoginDetails(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.name("passwd")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();

	}
}
