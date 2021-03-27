package ro.ase.cts.prototype.clase;

public class ClientStadion implements AbstractPrototype {
	private String nume;
	private int varsta;
	
	public ClientStadion(String nume, int varsta) {
		super();
		//facem validari(pentru a consuma resurse)
		this.nume = nume;
		this.varsta = varsta;
	}
	
	private ClientStadion() {
		super();
	}
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public int getVarsta() {
		return varsta;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientStadion [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public AbstractPrototype copy() {
		ClientStadion clona=new ClientStadion();
		//nu folosim set pentru ca ar fi consumator de resurse
		clona.nume=this.nume;
		clona.varsta=this.varsta;
		return clona;
	}
	
	
}
