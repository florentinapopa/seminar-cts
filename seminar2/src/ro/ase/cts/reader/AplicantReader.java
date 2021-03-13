package ro.ase.cts.reader;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {
	protected String numeFisier;
	
	public AplicantReader(String numeFisier) {
		super();
		this.numeFisier = numeFisier;
	}
	
	public abstract List<Aplicant> readAplicanti()  throws FileNotFoundException;

}
