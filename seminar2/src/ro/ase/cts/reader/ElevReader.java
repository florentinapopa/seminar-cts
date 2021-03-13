package ro.ase.cts.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ElevReader extends AplicantReader{
	
	
	public ElevReader(String numeFisier) {
		super(numeFisier);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant > readAplicanti() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.numeFisier));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant >();

		while (input2.hasNext()) {
			Elev e =new Elev();
			readAplicant(input2, e);
			int clasa = input2.nextInt();
			String tutore = input2.next();
			e.setClasa(clasa);
			e.setTutore(tutore);
			elevi.add(e);
		}

		input2.close();
		return elevi;
	}
}
