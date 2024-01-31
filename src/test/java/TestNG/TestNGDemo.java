package TestNG;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestNGDemo {
	
	@Test

	public void verifyPagetitle()
	{
		
		//Launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	@Test
	
	public void test2() {
		
		System.out.println("test case 2");
	}
	
	

}
