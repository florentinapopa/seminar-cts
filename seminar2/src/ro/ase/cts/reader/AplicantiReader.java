package ro.ase.cts.reader;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantiReader {
	protected String numeFisier;
	
	public AplicantiReader(String numeFisier) {
		super();
		this.numeFisier = numeFisier;
	}
	
	public abstract List<Aplicant> readAplicanti()  throws FileNotFoundException;

	public void readAplicant(Scanner scanner, Aplicant aplicant) {
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int nrProiecte = scanner.nextInt();
		String[] vectProiecte = new String[5];
		for (int i = 0; i < nrProiecte; i++) {
			vectProiecte[i] = scanner.next();
		}
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumiriProiect(vectProiecte,nrProiecte);
		
	}
}
