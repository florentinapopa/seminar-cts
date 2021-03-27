package ro.ase.cts.simple_factory.clase;

public class Portar extends AbstractJucator {

	public Portar(String nume, int varsta) {
		super(nume, varsta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Portar:");
		builder.append(super.toString());
		return builder.toString();
	}
	
	

}
