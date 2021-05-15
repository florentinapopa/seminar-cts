package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerObservabil {
	private List<IObserver> listaAbonati;

	public ManagerObservabil() {
		super();
		this.listaAbonati = new ArrayList<>();
	}
	
	public void aboneaza(IObserver observer) {
		listaAbonati.add(observer);
	}
	
	public void dezaboneaza(IObserver observer) {
		listaAbonati.remove(observer);
	}
	
	public void notifica(String mesaj) {
		for(IObserver observer:listaAbonati) {
			observer.primesteAnunt(mesaj);
		}
	}
	
}
