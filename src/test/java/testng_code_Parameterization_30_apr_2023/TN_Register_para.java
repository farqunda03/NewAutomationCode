package testng_code_Parameterization_30_apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TN_Register_para {
	public WebDriver driver;
	@Test
	@Parameters({ "browser", "url", "LinkMyAccount", "LinkRegister", "LinkFirstname", "LinkLastname", "LinkEmail",
			"LinkTelephone", "LinkPassword", "LinkConfirmPassword", "Firstname", "Lastname", "Email", "Telephone",
			"Password", "ConfirmPassword", "PolicyButton", "ContinueButton" })
	public void TNRegisterTest(String browser, String url, String LinkMyAccount, String LinkRegister,
			String LinkFirstname, String LinkLastname, String LinkEmail, String LinkTelephone, String LinkPassword,
			String LinkConfirmPassword, String Firstname, String Lastname, String Email, String Telephone,
			String Password, String ConfirmPassword, String PolicyButton, String ContinueButton) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		driver.get(url);
		driver.findElement(By.linkText(LinkMyAccount)).click();
		driver.findElement(By.linkText(LinkRegister)).click();
		driver.findElement(By.xpath(LinkFirstname)).sendKeys(Firstname);
		driver.findElement(By.xpath(LinkLastname)).sendKeys(Lastname);
		driver.findElement(By.xpath(LinkEmail)).sendKeys(Email);
		driver.findElement(By.xpath(LinkTelephone)).sendKeys(Telephone);
		driver.findElement(By.xpath(LinkPassword)).sendKeys(Password);
		driver.findElement(By.xpath(LinkConfirmPassword)).sendKeys(ConfirmPassword);
		driver.findElement(By.xpath(PolicyButton)).click();
		driver.findElement(By.cssSelector(ContinueButton)).click();
    }

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
