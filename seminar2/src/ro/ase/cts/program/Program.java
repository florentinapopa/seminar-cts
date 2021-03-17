package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.reader.AngajatiReader;
import ro.ase.cts.reader.AplicantiReader;
import ro.ase.cts.reader.StudentiReader;

public class Program {
	
	public static List<Aplicant> citireAplicanti(AplicantiReader reader) throws FileNotFoundException {
		return reader.readAplicanti();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citireAplicanti(new StudentiReader("studenti.txt"));
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				aplicant.statut();
				System.out.println(aplicant.finantare());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
