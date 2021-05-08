package ro.ase.cts.command.clase;

public class ComandaConstituire extends ComandaAbstracta{

	public ComandaConstituire(ContBancar executant, float suma) {
		super(executant, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.executant.constituire(super.suma);
	}

}
