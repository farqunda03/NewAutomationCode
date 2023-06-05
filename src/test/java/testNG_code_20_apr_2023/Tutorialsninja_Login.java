package testNG_code_20_apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tutorialsninja_Login {

	public WebDriver driver;

	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
	}
	@Test(priority = 1)
	public void clickOnLoginLink() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	@Test(priority = 2)
	public void enterCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("farqunda.afsar@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
	
	}
	@Test(priority = 3)
	public void clickOnLoginButton() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("farqunda.afsar@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
