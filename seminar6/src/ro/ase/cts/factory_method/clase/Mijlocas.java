package ro.ase.cts.factory_method.clase;

public class Mijlocas extends Jucator{

	public Mijlocas(String nume, int nrMeciuri) {
		super(nume, nrMeciuri);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mijlocas: ");
		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
