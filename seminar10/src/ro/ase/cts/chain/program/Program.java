package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.ComandaConstituire;
import ro.ase.cts.chain.clase.ComandaDepunere;
import ro.ase.cts.chain.clase.ComandaRetragere;
import ro.ase.cts.chain.clase.ContBancar;
import ro.ase.cts.chain.clase.ManagerComenzi;

public class Program {

	public static void main(String[] args) {
		ManagerComenzi manager=new ManagerComenzi();
		ContBancar cont=new ContBancar("Florentina");
		manager.invocaComanda(new ComandaConstituire(cont, 400));
		manager.invocaComanda(new ComandaDepunere(cont, 100));
		manager.executaComanda();
		manager.invocaComanda(new ComandaRetragere(cont, 300));
		manager.executaComanda();
		manager.executaComanda();
	}

}
