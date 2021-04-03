package ro.ase.cts.factory_method.clase;

public class Fundas extends Jucator{

	public Fundas(String nume, int nrMeciuri) {
		super(nume, nrMeciuri);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fundas: ");
		builder.append(super.toString());
		return builder.toString();
	}
	

}
