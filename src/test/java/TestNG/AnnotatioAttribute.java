package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotatioAttribute {

	
	@Test(description = "test case 1")
public void testcase1() {
		
		System.out.println("Mobile login testcase");
	}
	
	/*
	 * @Test(timeOut = 200)
	 * 
	 * public void testcase2() {
	 * 
	 * try { Thread.sleep(400); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * System.out.println("test case 2 executed");
	 * 
	 * }
	 */
	
	@Test(priority = 2) //priority attribute
public void testcase3() {
		
		System.out.println("Web login testcase");
	}
	
	@Test(priority = 1) //priority attribute
	public void testcase4() {
			
			System.out.println("API login testcase");
		}
	
	@Test(dependsOnMethods = {"testcase1"}) //depend on method attribute
	
	public void testcase5() {
		
		System.out.println("Depend on testcase 1");
	}
	
	@Test(enabled = false)
	
public void testcase8() {
		
		System.out.println("testcase 8");
	}
	
	
	
}
