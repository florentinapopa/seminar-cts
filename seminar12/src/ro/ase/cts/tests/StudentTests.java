package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testCorectitudineConstructorParametri() {
		String nume="gigel";
		Student student=new Student(nume);
	
		assertEquals(nume, student.getNume());
	}	
	
	@Test
	public void testInitializareListaInConstructorParametri() {
		Student student=new Student("gigel");
		//assertNotEquals(null, student.getNote()); echivalent cu assertNotNull
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testCorectitudineConstructorDefault() {
		Student student=new Student();
		assertNotNull("numele nu a fost initializat",student.getNume());
		assertNotNull("lista nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testMetodaAdaugareNotaInLista() {
		Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testDimensiuneLista() {
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(10);
		assertEquals(2, student.getNote().size());
	}
	
	@Test 
	public void testCalculMedie() {
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(7);
		//adaugam param delta cand avem float
		assertEquals(8.5f, student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testStudentCuRestante() {
		Student student=new Student();
		student.adaugaNota(4);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testStudentFaraRestante() {
		Student student=new Student();
		student.adaugaNota(8);
		assertFalse(student.areRestante());
	}
	//specific junit 3
	@Test
	public void testIndexInvalid() {
		Student student=new Student();
		student.adaugaNota(6);
		//1
		try {
			//2
			int nota=student.getNota(-1);
			//3->nu se ajunge
			fail("Metoda nu arunca exceptie");
		} catch (IndexOutOfBoundsException e) {
			// 4
		} catch(Exception ex) {
			//5->nu se ajunge
			fail("Metoda arunca alta exceptie");
		}
		//6
	}
	//specific junit 4
	@Test(expected = IndexOutOfBoundsException.class)
	public void testIndexInvalidJUnit4() {
		Student student=new Student();
		student.adaugaNota(6);
		int nota=student.getNota(-1);
			
	}

}
