
package assertions_23_apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsClassAssignment {

	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
	}

	@Test(priority = 1)
	public void clickOnMyAccount() {
		driver.findElement(By.linkText("My Account")).click();

	}

	@Test(priority = 2)
	public void clickOnRegister() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();

	}

	@Test(priority = 3)
	public void registerUserWithoutEnteringCredentials() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		String actualPrivacyPolicyWarningMessage = driver
				.findElement(By.xpath("//div[@class = 'alert alert-danger alert-dismissible']")).getText();
		String expectedPrivacyPolicyWarningMessage = "Warning: You must agree to the Privacy Policy!";

		softassert.assertTrue(actualPrivacyPolicyWarningMessage.contains(expectedPrivacyPolicyWarningMessage),
				"My assertion is false");

		//FirstName
		String actualFirstNameWarningMessage = driver
				.findElement(By.xpath("//div[contains(text(),'First Name must be between 1 and 32 characters!')]"))
				.getText();
		String expectedFirstNameWarningMessage = "First Name must be between 1 and 32 characters!";
		softassert.assertEquals(actualFirstNameWarningMessage,expectedFirstNameWarningMessage);
		//LastName
		
		String actualLastNameWarningMessage = driver
				.findElement(By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]"))
				.getText();
		String expectedLastNameWarningMessage = "Last Name must be between 1 and 32 characters!";
		softassert.assertEquals(actualLastNameWarningMessage,expectedLastNameWarningMessage);
		//Telephone
		
		
		String actualTelephoneWarningMessage = driver
				.findElement(By.xpath("//div[contains(text(),'Telephone must be between 3 and 32 characters!')]"))
				.getText();
		String expectedTelephoneWarningMessage = "Telephone must be between 3 and 32 characters!";
		softassert.assertNotEquals(actualTelephoneWarningMessage,expectedTelephoneWarningMessage);
		//Email
		
		String actualEmailWarningMessage = driver
				.findElement(By.xpath("//div[contains(text(),'E-Mail Address does not appear to be valid!')]"))
				.getText();
		String expectedEmailWarningMessage = "E-Mail Address does not appear to be valid!";
		softassert.assertEquals(actualEmailWarningMessage,expectedEmailWarningMessage);
		
		//Password
		
		String actualPasswordWarningMessage = driver
				.findElement(By.xpath("//div[contains(text(),Password must be between 4 and 20 characters!')]"))
				.getText();
		String expectedPasswordWarningMessage = "Password must be between 4 and 20 characters!";
		softassert.assertEquals(actualPasswordWarningMessage,expectedPasswordWarningMessage);
		

		softassert.assertAll();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
