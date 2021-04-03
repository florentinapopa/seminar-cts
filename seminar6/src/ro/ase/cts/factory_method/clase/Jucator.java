package ro.ase.cts.factory_method.clase;

public abstract class Jucator {
	private String nume;
	private int nrMeciuri;
	
	public Jucator(String nume, int nrMeciuri) {
		super();
		this.nume = nume;
		this.nrMeciuri = nrMeciuri;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jucator [nume=");
		builder.append(nume);
		builder.append(", nrMeciuri=");
		builder.append(nrMeciuri);
		builder.append("]");
		return builder.toString();
	}
	
}
