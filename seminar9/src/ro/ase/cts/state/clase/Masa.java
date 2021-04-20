package ro.ase.cts.state.clase;

public class Masa {
	private int nrPersoane;
	private int id;
	private StareMasa stare;
	
	public Masa(int nrPersoane, int id) {
		super();
		this.nrPersoane = nrPersoane;
		this.id = id;
		this.stare = new MasaLibera();
	}

	public StareMasa getStare() {
		return stare;
	}

	//e default ca sa nu putem schimba starea din main
	void setStare(StareMasa stare) {
		this.stare = stare;
	}
	
	public void ocupaMasa(String nume) {
		if(this.stare instanceof MasaRezervata) {
			System.out.println(nume+" a ocupat masa "+this.id);
			this.setStare(new MasaOcupata());
		} else {
			System.out.println("Nu poate fi ocupata");
		}
	}
	
	public void rezervaMasa(String nume) {
		if(this.stare instanceof MasaLibera) {
			System.out.println(nume+" a rezervat masa "+this.id);
			this.setStare(new MasaRezervata());
		} else {
			System.out.println("Nu poate fi rezervata");
		}
	}
	
	public void elibereazaMasa(String nume) {
		if(!(this.stare instanceof MasaLibera)) {
			System.out.println(nume+" a eliberat masa "+this.id);
			this.setStare(new MasaLibera());
		} else {
			System.out.println("Masa e libera");
		}
	}
	
}
