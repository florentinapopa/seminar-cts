package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;

public class Program {

	public static void main(String[] args) {
		ManagerSala manager=new ManagerSala("Popescu", "sala 1");
		
		ClientAbonat client1=new ClientAbonat("Maria");
		ClientAbonat client2=new ClientAbonat("Bogdan");
		ClientAbonat client3=new ClientAbonat("Mihai");
		manager.aboneaza(client1);
		manager.aboneaza(client2);
		manager.aboneaza(client3);
		manager.anuntaMeci("fotbal");
		manager.dezaboneaza(client3);
		manager.anuntaMeci("handbal");

	}

}
