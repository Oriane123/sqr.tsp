package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	public void testDistanceTo_SameCity() {
		City c1 = new City();
		City c2 = c1;
		
		double expected = 0;
		double actual = c1.distanceTo(c2);
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testDistanceTo_DifferentCity() {
		City c1 = new City(-2,6);
		City c2 = new City(-2,2);
		
		double expected = 4;
		double actual = c1.distanceTo(c2);
		
		assertEquals(expected, actual, 0);
	}

}
