package java_OOPS_interface_indetail_23rd_apr;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sync extends Demo implements Execute, Execute_New {

	// a concrete class can extend abstract class
	// a concrete class can implement an interface
	// a concrete class can implement multiple interfaces
	// a concrete class can extend an abstract Class and implement multiple
	// interfaces at the same time

	// Sync is an example here is the implementing class

	// canI create the object of an interface?? NO
	// Abstract class cannot instantiate
	// Interface cannot instantiate

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

	}

	@Override
	public void chase() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dummy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sample() {
		// TODO Auto-generated method stub
		
	}


}
