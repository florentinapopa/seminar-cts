package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.ContAbstract;
import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;

public class program {

	public static void main(String[] args) {
		ContAbstract contCurent=new ContCurent(200);
		ContAbstract contEconomii=new ContEconomii(500);
		ContAbstract contCredit=new ContCredit(700);
		
		contCurent.setCont(contEconomii);
		contEconomii.setCont(contCredit);
		
		contCurent.realizeazaPlata(170);
		contCurent.realizeazaPlata(330);
		contCurent.realizeazaPlata(500);
		contCurent.realizeazaPlata(500);
		
		
	}

}
