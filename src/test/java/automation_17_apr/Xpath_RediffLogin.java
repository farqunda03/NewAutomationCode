package automation_17_apr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_RediffLogin {
	
	public static WebDriver driver;;

	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		driver.findElement(By.xpath("//p[@id='signin_info']/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@class = 'floatL leftwidth']/following::div[1]/preceding::input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//div[@class='wrapper']//child::div[@class='pwdpass']//child::input[1]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@id='div_login_error']/following::input[@name ='proceed']")).click();

	}

}
