package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	@Test
	@Parameters({"i","j"})
	public void add(int a, int b) 
	{

		System.out.println("addition:  " + (a+b));
	}
	@Test
	@Parameters({"i","j"})
	public void substraction(int a, int b) 
	{
		System.out.println("substraction: " + (a-b) );

	}

	@Test
	@Parameters({"i","j"})
	public void Multiplication(int a, int b) 
	{
		System.out.println("Multiplication: "  + a*b);

	}

}
