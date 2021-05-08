package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

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
