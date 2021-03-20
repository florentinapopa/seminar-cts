package ro.ase.cts.ingrijire;


public class Parfum {
	private String denumire;
	private double cantitate;
	private int codBare;
	private static Parfum instance=null;
	
	private Parfum(String denumire, double cantitate, int codBare) {
		super();
		this.denumire = denumire;
		this.cantitate = cantitate;
		this.codBare = codBare;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public void setCantitate(double cantitate) {
		this.cantitate = cantitate;
	}

	public void setCodBare(int codBare) {
		this.codBare = codBare;
	}
	
	public static synchronized Parfum getInstance(String denumire, double cantitate, int codBare) {
		if(instance==null) {
			instance = new Parfum(denumire, cantitate , codBare);
		}
		return instance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parfum [denumire=");
		builder.append(denumire);
		builder.append(", cantitate=");
		builder.append(cantitate);
		builder.append(", codBare=");
		builder.append(codBare);
		builder.append("]");
		return builder.toString();
	}
	
	

}
