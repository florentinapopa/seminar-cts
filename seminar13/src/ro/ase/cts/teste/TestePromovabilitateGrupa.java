package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;
import ro.ase.cts.dubluri.StudentDummy;
import ro.ase.cts.teste.categorii.PromovabilitateCategory;
import ro.ase.cts.teste.categorii.UrgentTestCategory;

@Category(PromovabilitateCategory.class)
public class TestePromovabilitateGrupa {
	
	@Test
	@Category(UrgentTestCategory.class)
	public void testRight() {
		Grupa grupa=new Grupa(1085);
		for(int i=0;i<3;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(4);
			student.adaugaNota(5);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<3;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(9);
			student.adaugaNota(5);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.5, grupa.getPromovabilitate(),0.01);
	}
	
	
	@Test
	public void testBoundaryInferior() {
		Grupa grupa=new Grupa(1085);
		for(int i=0;i<6;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(2);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0, grupa.getPromovabilitate(),0.01);
	}
	
	@Test
	public void testBoundarySuperior() {
		Grupa grupa=new Grupa(1085);
		for(int i=0;i<6;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(8);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}
	
	@Test (expected=IndexOutOfBoundsException.class)
	public void testError() {
		Grupa grupa=new Grupa(1011);
		grupa.getPromovabilitate();
	}
	
	
	
	
	
}
