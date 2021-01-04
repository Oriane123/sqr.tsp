package tsp.lee.jacobson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TourTest {

	@Test
	public void testGetDistance_4city() {
		City c1 = new City(0,0);
		City c2 = new City(2,2);
		City c3 = new City(1,1);
		City c4 = new City(1,2);
		
		ArrayList<City> liste = new ArrayList<City>();
		liste.add(c1);
		liste.add(c2);
		liste.add(c3);
		liste.add(c4);
		
		Tour t = new Tour(liste);
		
		int expected = 6;
		int actual = t.getDistance();
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testGetDistance_nulle() {
		City c1 = new City(0,0);
		
		ArrayList<City> liste = new ArrayList<City>();
		liste.add(c1);
		
		Tour t = new Tour(liste);
		
		int expected = 0;
		int actual = t.getDistance();
		
		assertEquals(expected, actual);
		
	}
}
