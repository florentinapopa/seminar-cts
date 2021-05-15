package ro.ase.cts.observer.clase;

public class ClientAbonat implements IObserver {
	private String nume;
	
	
	public ClientAbonat(String nume) {
		super();
		this.nume = nume;
	}


	@Override
	public void primesteAnunt(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" primeste anuntul: "+mesaj);
	}
	
}
