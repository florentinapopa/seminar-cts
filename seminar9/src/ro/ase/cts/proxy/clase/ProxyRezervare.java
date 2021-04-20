package ro.ase.cts.proxy.clase;

public class ProxyRezervare implements IOperatorRezervari {
	private OperatorRezervare rezervare;
	private int limita;	
	
	public ProxyRezervare(OperatorRezervare rezervare, int limita) {
		super();
		this.rezervare = rezervare;
		this.limita = limita;
	}

	@Override
	public void rezerva(int nr) {
		if(nr>=limita) {
			rezervare.rezerva(nr);
		} else {
			System.out.println("Numarul de persoane e prea mic!");
		}
	}

}
