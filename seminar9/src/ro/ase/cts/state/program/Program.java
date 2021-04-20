package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Masa;
import ro.ase.cts.state.clase.MasaLibera;
import ro.ase.cts.state.clase.MasaOcupata;
import ro.ase.cts.state.clase.MasaRezervata;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa=new Masa(4,12);
		masa.rezervaMasa("Flori");
		masa.rezervaMasa("Bogdan");
		masa.ocupaMasa("Flori");
		masa.elibereazaMasa("Flori");
		masa.elibereazaMasa("Flori");
		
		Masa masa2=new Masa(3, 10);
		MasaLibera libera=new MasaLibera();
		MasaRezervata rezervata=new MasaRezervata();
		MasaOcupata ocupata=new MasaOcupata();
		
		libera.modificaStare(masa2);
		rezervata.modificaStare(masa2);
		ocupata.modificaStare(masa2);
		
	}
}
