package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;
import ro.ase.cts.adapter.clase.LeasingAdapter;
import ro.ase.cts.adapter.clase.LeasingClassAdapter;

public class Program {
	
	public static void creeazaCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leasing leasing=new Leasing(3500, "Flori");
		LeasingAdapter creditAdapter=new LeasingAdapter(leasing);
		creeazaCredit(creditAdapter);
		
		LeasingClassAdapter creditClassAdapater=new LeasingClassAdapter(4000, "Maria");
		creeazaCredit(creditClassAdapater);
		

	}

}
