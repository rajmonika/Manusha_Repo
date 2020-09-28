package Test1;

import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test
	public void sum()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("Sum is:"+c);
	}
	
	@Test
	public void sub()
	{
		int a,b,c;
		a=100;
		b=20;
		c=a-b;
		System.out.println("Difference is: "+c);
	}
	
	@Test
	public void multiply()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a*b;
		System.out.println("Product is: "+c);
	}
	

}
