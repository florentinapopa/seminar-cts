package ro.ase.cts.template.clase;

public abstract class SpectatorAbstract {
	public abstract void asezareCoada();
	public abstract void prezintaBilet();
	public abstract void realizeazaControl();
	public abstract void ocupaLoc();
	
	public final void intrareStadion() {
		asezareCoada();
		prezintaBilet();
		realizeazaControl();
		ocupaLoc();
	}
	
}
