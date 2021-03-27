package ro.ase.cts.simple_factory.clase;

public abstract class AbstractJucator {
	private String nume;
	private int varsta;
	public AbstractJucator(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractJucator [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}
	
	

}
