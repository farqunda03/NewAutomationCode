package automation_17_apr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customized_Xpath {
	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		driver.findElement(By.xpath("//a[@class='mailicon']")).click();
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='cell']/following-sibling::div[1]/child::a[1]")).click();
		driver.findElement(By.xpath("//a[@class='moneyicon relative']/preceding-sibling::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='fnt0']/following::div[@class='cell topicons']/following::a[1]"))
				.click();

		driver.findElement(By.xpath("//a[@class = 'moneyicon relative']")).click();
		driver.findElement(By.xpath("//div[@class = 'cell topicons']/child::a[2]")).click();
		driver.findElement(By.xpath("//div[@class = 'cell']/following::a[2]")).click();
		driver.findElement(
				By.xpath("//a[@class='bmailicon relative']/preceding-sibling::a[@class='moneyicon relative']")).click();
		driver.findElement(By.xpath("//div[@class='cell alignR toprlinks']/preceding::a[@class='moneyicon relative']"))
				.click();

		driver.findElement(By.xpath("//a[@class='bmailicon relative']")).click();
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@class = 'cell']/following::a[3]")).click();
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
	}

}
