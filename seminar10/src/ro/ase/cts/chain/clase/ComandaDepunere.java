package ro.ase.cts.chain.clase;

public class ComandaDepunere extends ComandaAbstracta{

	public ComandaDepunere(ContBancar executant, float suma) {
		super(executant, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.executant.depunere(super.suma);
	}

}
