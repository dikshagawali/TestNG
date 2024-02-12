package TestNG;  
import org.testng.annotations.Test;  
import org.testng.asserts.SoftAssert;  
public class Assert {  
SoftAssert soft_assert=new SoftAssert();  
@Test  
public void Soft_Assert()  
{  
 soft_assert.assertTrue(false);  
 System.out.println("soft assertion");  
}  
@Test  
public void Hard_Assert()  
{  
 Assert.assertTrue(false);  
 System.out.println("hard assertion");  
}
private static void assertTrue(boolean b) {
	// TODO Auto-generated method stub
	
}  
}