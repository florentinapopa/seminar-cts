package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.reader.AngajatReader;
import ro.ase.cts.reader.AplicantReader;
import ro.ase.cts.reader.StudentReader;

public class Program {
	public static List<Aplicant> citireAplicanti(AplicantReader reader) throws FileNotFoundException {
		return reader.readAplicanti();
	}

	public static void main(String[] args) {
		List<Aplicant> lista;
		try {
			lista = citireAplicanti(new StudentReader("studenti.txt"));
			for(Aplicant a:lista)
				System.out.println(a.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
