package cuongnh0609.tryjunit4;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;

public class AnotherTest {
	
	static {
		System.out.println("Static initialize is called");
	}
	
	{
		System.out.println("Instance initialize is called");
	}

	public static void main(String[] args) {
		JUnitCore.main(AnotherTest.class.getName());
	}
	
	public AnotherTest() {
		System.out.println("Constructor is called");
	}

	@BeforeClass
	public static void doBeforeClass() {
		System.out.println("Calling doBeforeClass");
	}
	
	@Before
	public void doBefore() {
		System.out.println("Calling doBefore");
	}
	
	@Test
	public void testOne() {
		System.out.println("Calling testOne");
		String str = "Something";
		assertEquals(str.charAt(0), 'S');
	}
	
	@Test
	public void testTwo() {
		System.out.println("Calling testTwo");
		String str = "Something";
		assertEquals(str.charAt(1), 'o');
	}
	
	@After
	public void doAfter() {
		System.out.println("Calling doAfter");
	}
	
	@AfterClass
	public static void doAfterClass() {
		System.out.println("Calling doAfterClass");
	}

}
