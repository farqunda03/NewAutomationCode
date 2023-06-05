package testng_code_Parameterization_30_apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TN_Parameterize {
	public WebDriver driver;

	@Test
	@Parameters({ "browser", "url", "email", "password", "LinkMyAccount", "LinkLogin", "LocatorLoginButton",
			"emailTextbox", "passwordTextbox" })
	public void TNLoginTest(String browser, String url, String email, String password, String LinkMyAccount,
			String LinkLogin, String LocatorLoginButton, String passwordTextbox, String emailTextbox) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		driver.get(url);
		driver.findElement(By.linkText(LinkMyAccount)).click();
		driver.findElement(By.linkText(LinkLogin)).click();
		driver.findElement(By.id(emailTextbox)).sendKeys(email);
		driver.findElement(By.id(passwordTextbox)).sendKeys(password);
		driver.findElement(By.cssSelector(LocatorLoginButton)).click();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
