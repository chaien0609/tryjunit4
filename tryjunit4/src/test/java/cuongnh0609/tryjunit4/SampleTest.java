package cuongnh0609.tryjunit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;

public class SampleTest {

	public static void main(String[] args) {
		JUnitCore.main(SampleTest.class.getName());
	}
	
	@Test
	public void testOne() {
		String str = "Something";
		assertEquals(str.charAt(0), 'S');
	}
}
