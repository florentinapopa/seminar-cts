package ro.ase.cts.chain.clase;

public class ComandaRetragere extends ComandaAbstracta{

	public ComandaRetragere(ContBancar executant, float suma) {
		super(executant, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.executant.retragere(super.suma);
	}

}
