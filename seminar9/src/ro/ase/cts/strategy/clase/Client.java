package ro.ase.cts.strategy.clase;

public class Client {
	private String nume;
	private IModPlata modPlata;
	
	public Client(String nume, IModPlata modPlata) {
		super();
		this.nume = nume;
		this.modPlata = modPlata;
	}

	public void setModPlata(IModPlata modPlata) {
		this.modPlata = modPlata;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void platesteNota(int suma) {
		System.out.println("Clientul: "+this.nume+" ");
		modPlata.plateste(suma);
	}

}
