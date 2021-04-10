package ro.ase.cts.adapter.clase;

public class LeasingClassAdapter extends Leasing implements CreditAbstract{

	public LeasingClassAdapter(float suma, String client) {
		super(suma, client);
	}

	@Override
	public void oferaCredit() {
		super.creeazaLeasing();
		
	}

}
