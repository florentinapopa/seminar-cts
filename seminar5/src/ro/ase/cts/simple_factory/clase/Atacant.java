package ro.ase.cts.simple_factory.clase;

public class Atacant extends AbstractJucator{

	public Atacant(String nume, int varsta) {
		super(nume, varsta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant:");
		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
