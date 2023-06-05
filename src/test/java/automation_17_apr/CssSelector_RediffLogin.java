package automation_17_apr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_RediffLogin {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://rediff.com");
			driver.findElement(By.cssSelector("a.signin")).click();
			driver.findElement(By.cssSelector("input[id=login1]")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.cssSelector("div#div_login_error + div.table > div:nth-child(2) >div:nth-child(2)>div:nth-child(1)>input#password")).sendKeys("Selenium@123");
			//driver.findElement(By.cssSelector("")).click();

		}

	}


