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

}
