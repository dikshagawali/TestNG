package TestNG;

import org.testng.annotations.Test;

public class GroupAttribute {
	
	@Test(groups = "software company")
	public void infosys() {
		
		System.out.println("infosys");
	}
	
	@Test(groups = "software company")
public void wipro() {
		
		System.out.println("wipro");
	}

	
	@Test(groups = "Automobile company")
public void maruti() {
	
	System.out.println("maruti");
}


	@Test(groups = "Automobile company")
public void tata() {
	
	System.out.println("tata");
}

}
