package ro.ase.cts.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TesteConstructorGrupa.class, TestePromovabilitateGrupa.class, TestePromovabilitateGrupaCuDubluri.class,
		TestPromovabilitateGrupaWithFixture.class })
public class AllTests {

}
