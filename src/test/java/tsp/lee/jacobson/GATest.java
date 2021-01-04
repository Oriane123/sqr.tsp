package tsp.lee.jacobson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GATest {

	@Test
	public void testEvolvePopulation_UniquePopulation() {
		
		City c1 = new City(0,0);
		City c2 = new City(2,2);
		
		ArrayList<City> liste = new ArrayList<City>();
		liste.add(c1);
		liste.add(c2);
		Tour t = new Tour(liste);
		
		Population pop = new Population(1, false);
		pop.saveTour(0, t);
		Population pop2 = GA.evolvePopulation(pop);
		
		assertEquals(pop.getTour(0), pop2.getTour(0));
	}
	
	@Test
	public void testEvolvePopulation_bestTIst() {
		
		City c1 = new City(0,0);
		City c2 = new City(2,2);
		
		ArrayList<City> liste = new ArrayList<City>();
		liste.add(c1);
		Tour t1 = new Tour(liste);
		liste.add(c2);
		Tour t = new Tour(liste);
		
		Population pop = new Population(2, false);
		pop.saveTour(0, t);
		pop.saveTour(1, t1);
		Population pop2 = GA.evolvePopulation(pop);
		
		assertEquals(pop.getTour(1), pop2.getTour(0));
	}
	
	@Test
	public void testEvolvePopulation_bestIst1() {
		
		City c1 = new City(0,0);
		City c2 = new City(2,2);
		City c3 = new City(3,3);
		City c4 = new City(4,4);
		
		ArrayList<City> liste = new ArrayList<City>();
		liste.add(c1);
		liste.add(c2);
		liste.add(c3);
		Tour t1 = new Tour(liste);
		
		ArrayList<City> liste2 = new ArrayList<City>();
		liste2.add(c2);
		liste2.add(c4);
		liste2.add(c3);
		Tour t = new Tour(liste2);
		
		Population pop = new Population(2, false);
		pop.saveTour(0, t);
		pop.saveTour(1, t1);
		Population pop2 = GA.evolvePopulation(pop);
		
		assertEquals(pop.getTour(0), pop2.getTour(0));
	}

}
