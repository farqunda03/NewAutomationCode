package automation_code_extra_topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart_Multiple_WebElements {
	public WebDriver driver;


@Test(priority=1)

public void flipkart() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/shirt/men-shirt/formal-shirt/pr?sid=clo,ash,axc,mmk,bk1&otracker=categorytree&otracker=nmenu_sub_Men_0_Formal%20Shirts");
	List<WebElement> formalshirts =driver.findElements(By.xpath("//div[@class = '_2WkVRV']"));
	
	//WebElements 
	//for int(i=0; i<)
	
	
}


@Test(priority=2)
 public void rediffFotter()
 {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	List<WebElement> footerLinks =driver.findElements(By.xpath("//div[@class='footer alignC >a']"));
	System.out.println("Total no of links in footer:"+footerLinks.size());
	
 }}