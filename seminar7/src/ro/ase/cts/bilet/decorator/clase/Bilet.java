package ro.ase.cts.bilet.decorator.clase;

public class Bilet implements BiletAbstract{
	private String echipaGazda;
	private String echipaAdversar;
	public Bilet(String echipaGazda, String echipaAdversar) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaAdversar = echipaAdversar;
	}
	public String getEchipaGazda() {
		return echipaGazda;
	}
	public String getEchipaAdversar() {
		return echipaAdversar;
	}
	@Override
	public void rezervaBilet() {
		// TODO Auto-generated method stub
		System.out.println("Bilet rezervat: "+echipaGazda+" vs "+echipaAdversar);
	}
	
	
}
