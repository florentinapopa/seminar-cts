package ro.ase.cts.template.clase;

public class Spectator extends SpectatorAbstract{
	private String nume;
	private int nrBilet;
	
	

	public Spectator(String nume, int nrBilet) {
		super();
		this.nume = nume;
		this.nrBilet = nrBilet;
	}

	@Override
	public void asezareCoada() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" sta la coada");
	}

	@Override
	public void prezintaBilet() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" a prezentat biletul "+this.nrBilet);
	}

	@Override
	public void realizeazaControl() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" a fost controlat");
	}

	@Override
	public void ocupaLoc() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" ocupa loc");
	}

}
