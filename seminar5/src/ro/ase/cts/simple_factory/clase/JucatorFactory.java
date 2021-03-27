package ro.ase.cts.simple_factory.clase;

public class JucatorFactory {
	public AbstractJucator getJucator(TipJucator tip, String nume, int varsta) {
		switch(tip) {
		case PORTAR: 
			return new Portar(nume,varsta);
		case FUNDAS: 
			return new Fundas(nume,varsta);
		case ATACANT: 
			return new Atacant(nume,varsta);
		default:
			throw new IllegalArgumentException();
		}
	}
}
