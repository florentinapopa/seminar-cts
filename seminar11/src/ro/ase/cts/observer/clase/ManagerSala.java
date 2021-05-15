package ro.ase.cts.observer.clase;

public class ManagerSala extends ManagerObservabil{
	private String nume;
	private String sala;
	public ManagerSala(String nume, String sala) {
		super();
		this.nume = nume;
		this.sala = sala;
	}
	
	public void anuntaMeci(String tip) {
		super.notifica("Va avea loc un meci de "+tip+" in sala "+sala);
	}
}
