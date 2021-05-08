package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	private List<ComandaAbstracta> listaComenzi;
	
	public ManagerComenzi() {
		this.listaComenzi=new ArrayList<>();
	}
	
	public void invocaComanda(ComandaAbstracta comanda) {
		this.listaComenzi.add(comanda);
	}
	
	public void executaComanda() {
		if(this.listaComenzi.size()>0) {
			this.listaComenzi.get(0).executa();
			this.listaComenzi.remove(0);
		}
	}
}
