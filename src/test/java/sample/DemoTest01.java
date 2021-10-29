package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest01 {
	
	@Test
	public void TestCase01() {
		
		System.out.println("test case 01");
	}

	
	@Test
	public void TestCase02() {
		
		System.out.println("test case 02");
	}

	@Test
	public void TestCase03() {
		
		System.out.println("test case 03");
		Assert.assertTrue(false);
	}
	

	@Test
	public void TestCase04() {
		
		System.out.println("test case 04");
	}

}
