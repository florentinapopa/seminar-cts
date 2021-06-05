package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.teste.categorii.UrgentTestCategory;

public class TesteConstructorGrupa {

	
	@Test
	@Category(UrgentTestCategory.class)
	public void testRight() {
		Grupa grupa=new Grupa(1085);
		
		assertEquals(1085,grupa.getNrGrupa());
	}
	
	@Test
	public void testBoundaryLimitaInferioara() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test 
	@Category(UrgentTestCategory.class)
	public void testBoundaryLimitaSuperioara() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testErrorLimitaInferioara() {
		Grupa grupa=new Grupa(700);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testErrorLimitaSuperioara() {
		Grupa grupa=new Grupa(1700);
	}
	
	@Test(timeout = 500)
	public void testPerformanceTimp() {
		Grupa grupa=new Grupa(1034);
	}
	
	@Test
	public void testExistance() {
		Grupa grupa=new Grupa(1078);
		assertNotNull(grupa.getStudenti());
	}

}
