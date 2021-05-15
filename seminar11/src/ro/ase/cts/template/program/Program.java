package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpectatorAbstract spectator=new Spectator("Flori", 12);
		SpectatorAbstract spectatorVIP=new SpectatorVIP("Maria", "Loja 13");
		spectator.intrareStadion();
		spectatorVIP.intrareStadion();
	}

}
