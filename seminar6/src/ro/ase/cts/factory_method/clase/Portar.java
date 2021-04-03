package ro.ase.cts.factory_method.clase;

public class Portar extends Jucator{

	public Portar(String nume, int nrMeciuri) {
		super(nume, nrMeciuri);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Portar ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
