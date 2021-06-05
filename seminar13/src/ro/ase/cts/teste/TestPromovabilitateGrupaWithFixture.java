package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;
import ro.ase.cts.teste.categorii.PromovabilitateCategory;

public class TestPromovabilitateGrupaWithFixture {
private Grupa grupa;
	
	@Before
	public void setUp() {
		grupa=new Grupa(1070);
		for(int i=0;i<35;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(8);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
	}
	
	@Test (timeout = 500)
	@Category(PromovabilitateCategory.class)
	public void testPerformancePentruTimp() {
		grupa.getPromovabilitate();
	}
}
