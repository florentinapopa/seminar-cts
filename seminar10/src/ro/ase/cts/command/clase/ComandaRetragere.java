package ro.ase.cts.command.clase;

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
