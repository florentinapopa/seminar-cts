package ro.ase.cts.simple_factory.clase;

public class Fundas extends AbstractJucator {

	public Fundas(String nume, int varsta) {
		super(nume, varsta);
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
