package ro.ase.cts.composite.clase;

public abstract class ComponentaMeniu {
	private String nume;
		
	public ComponentaMeniu(String nume) {
		super();
		this.nume = nume;
	}
	
	
	public String getNume() {
		return nume;
	}


	public abstract void afisareDescriere();
	public abstract ComponentaMeniu getComponente(int i) throws Exception;
	public abstract void adaugaComponenta(ComponentaMeniu componentaMeniu) throws Exception;
	public abstract void stergeComponenta(ComponentaMeniu componentaMeniu) throws Exception;
	
}
