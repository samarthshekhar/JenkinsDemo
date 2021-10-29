package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest02 {
	
	
	

	@Test
	public void TestCase06() {
		
		System.out.println("test case 06");
	}

	
	@Test
	public void TestCase07() {
		
		System.out.println("test case 07");
	}

	@Test
	public void TestCase08() {
		
		System.out.println("test case 08");
		Assert.assertTrue(true);
	}
	

	@Test (dependsOnMethods ="TestCase08")
	public void TestCase09() { 
		
		System.out.println("test case 09");
	}


}
