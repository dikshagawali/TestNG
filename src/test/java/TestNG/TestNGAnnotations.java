package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeSuite
	
	public void beforesuite() {
		
		System.out.println("Before Suite");
	}
	
@AfterSuite
	
	public void Aftersuite() {
		
		System.out.println("After Suite");
	}
	
	@AfterMethod
	
	public void afterMethod() {
		
		System.out.println("After Method");
		
	}
	
	@BeforeClass
	
public void beforeClass() {
		
		System.out.println("Before class");
	}
	
	@AfterClass
	
public void afterClass() {
		
		System.out.println("After class");
	}
	
	@Test
		public void test1() {
		
		System.out.println("This is test 1");
	}
	
	@Test
public void test2() {
		
		System.out.println("This is test 2");
	}
	
	@BeforeMethod

	public void beforeM() {
		
		System.out.println("Before Method");
	}
	
@BeforeTest
	
	public void bt() {
		
		System.out.println("Before Test");
	}

@AfterTest

public void afterTest() {
	
	System.out.println("After Test");
}
	
}
