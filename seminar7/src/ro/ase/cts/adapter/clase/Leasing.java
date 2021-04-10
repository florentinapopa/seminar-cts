package ro.ase.cts.adapter.clase;

public class Leasing {
	private float suma;
	private String client;
	public Leasing(float suma, String client) {
		super();
		this.suma = suma;
		this.client = client;
	}
	
	public void creeazaLeasing() {
		System.out.println("Clientul "+this.client+" a primit un leasing de "+this.suma);
	}
}
