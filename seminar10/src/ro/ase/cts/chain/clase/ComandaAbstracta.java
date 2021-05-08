package ro.ase.cts.chain.clase;

public abstract class ComandaAbstracta {
	protected ContBancar executant;
	protected float suma;
	
	public ComandaAbstracta(ContBancar executant, float suma) {
		super();
		this.executant = executant;
		this.suma = suma;
	}
	
	public abstract void executa();
	
}
