package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMeci;
import ro.ase.cts.memento.clase.Meci;
import ro.ase.cts.memento.clase.Memento;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meci meci=new Meci(200, "Dinamo", "Steaua", 200, 30);
		
		Memento memento=meci.creeazaMemento();
		ManagerMeci manager=new ManagerMeci();
		manager.adaugaMemento(memento);
		
		meci.setEchipaAdversar("romania");
		meci.setEchipaGazda("spania");
		meci.setNrSpectatori(290);
		manager.adaugaMemento(meci.creeazaMemento());
		System.out.println(meci.toString());
		meci.setMemento(manager.getMemento(0));
		System.out.println(meci.toString());
	}

}
