package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodAttribute {

	
	@Test(dependsOnMethods = {"testcase7"})
	public void testcase6() {
			
			System.out.println("Depend on testcase 7");
		}
		
		
		@Test
	public void testcase7() {
		
			Assert.assertTrue(false);

		System.out.println("test case 7"); //If test case 7 will failed then test case 6 automatically will get fail due to depend attribute
		
		
		}
}
