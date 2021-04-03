package ro.ase.cts.factory_method.clase;

public class Atacant extends Jucator  {

	public Atacant(String nume, int nrMeciuri) {
		super(nume, nrMeciuri);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant: ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
