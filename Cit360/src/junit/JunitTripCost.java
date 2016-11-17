package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class JunitTripCost {

	@Test
	public void testTripCost() {
		tripCost tripCost = new tripCost();
		double result  = tripCost.estimate(25, 2, 2500);
		assertEquals(2500 / (2 * 25), result, 1);
		assertFalse(result < 0);
		assertFalse(result > 100);
	}
	
	public void testShoe() {
		Shoe shoe = new Shoe("Nike", "Basketball", "Black", "9");
		assertNotNull(shoe);
		
		String nullString = null;
		String first = "123";
		String second = "123";
		assertNull(nullString);
		assertSame(first, second);
		
	}

}
