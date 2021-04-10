package ro.ase.cts.adapter.clase;

public class LeasingAdapter implements CreditAbstract{
	private Leasing leasing;

	public LeasingAdapter(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void oferaCredit() {
		// TODO Auto-generated method stub
		leasing.creeazaLeasing();
	}
	
	

}
