package ro.ase.cts.simple_factory.clase;

public class FactorySingleton {
	private static FactorySingleton instance=null;
	
	private FactorySingleton() {
		
	}
	
	public static synchronized FactorySingleton getInstance() {
		if(instance==null) {
			instance=new FactorySingleton();
		}
		return instance;
	}
	
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
