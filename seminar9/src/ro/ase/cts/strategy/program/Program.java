package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlataCard;
import ro.ase.cts.strategy.clase.PlataCash;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client=new Client("Florentina",new PlataCard());
		client.platesteNota(20);
		client.setModPlata(new PlataCash());
		client.platesteNota(5);

	}

}
