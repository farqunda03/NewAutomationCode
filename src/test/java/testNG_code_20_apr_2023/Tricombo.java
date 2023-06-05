package testNG_code_20_apr_2023;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tricombo {
	
	@BeforeSuite
	public void excutionFirst() {
		System.out.println("This will execute first - BeforeSuite");
	}
	
	@BeforeTest
	public void executionSecond() {
		System.out.println("This will execute first - BeforeTest");
		
	}
	@BeforeClass
	public void executionThird() {
		System.out.println("this will execute third - BeforeClass");
	}
	@BeforeMethod
	public void executionPreImportant() {
		System.out.println("We mostly use Before Method in combination with @Test annotation");
	}
    @Test
    public void testCase1() {
    	System.out.println("This is test case 1");
    }
    @Test 
    public void testCase2() {
    	System.out.println("Test case 2");
    }
    @Test 
    public void testCase3() {
    	System.out.println("Test case 3");
    }
    @AfterMethod
    public void afterMethod() {
    	System.out.println("Ending after each test case");
    }
}
