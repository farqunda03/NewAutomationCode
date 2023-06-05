package automation_code_DatePicker_14th_May_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DatePicker {
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Test
	public void seleniumPraciseBlogspotCalendar() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		WebElement calendar = driver.findElement(By.id("datepicker"));
		calendar.click();
	
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		selectCalendar("25","December","2027");
	}
	
	public void selectCalendar(String calendarDay,String calendarMonth,String calendarYear) throws InterruptedException {
		
		//months other than February cannot be more than 31
		if(Integer.parseInt(calendarDay)>31) {
			System.out.println("Invalid date because days of month greater than 31 ");
			return;
		}
		
		//month of February cannot have more than 29 days
		if(calendarMonth.equals("February") && Integer.parseInt(calendarDay)>29) {
			System.out.println("Invalid date because February month days greater than 29");
		}
		
		
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println("The month and year is :"+ monthYear);
		Thread.sleep(2000);
		
		//now I will consider the monthYear as string entity and based on split() we will use webElement
		//System.out.println("The month and year is :"+ monthYear);
		
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		while(!(month.equals(calendarMonth) && year.equals(calendarYear))) {
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			 month = monthYear.split(" ")[0];
		     year = monthYear.split(" ")[1];
		}
		Thread.sleep(1000);
		String dynamicXpath = "//td[@data-handler = 'selectDay']/a[text()=\'"+calendarDay+"\']";
		driver.findElement(By.xpath(dynamicXpath)).click();
	}
	

}
