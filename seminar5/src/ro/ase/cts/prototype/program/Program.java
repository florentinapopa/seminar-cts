package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.AbstractPrototype;
import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ClientStadion;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractPrototype abstractPrototype = new ClientStadion("Flori", 21);
		AbstractPrototype abstractPrototype2 = abstractPrototype.copy();
		ClientStadion clientStadion = (ClientStadion)abstractPrototype.copy();
		clientStadion.setNume("Maria");
		System.out.println(abstractPrototype.toString());
		System.out.println(abstractPrototype2.toString());
		System.out.println(clientStadion.toString());
		System.out.println(clientStadion.toString());
		
		Bilet bilet=new Bilet(1,"echipa1","echipa2","27 martie, 10:00");
		Bilet bilet2=(Bilet)bilet.copy();
		bilet2.setCod(10);
		System.out.println(bilet.toString());
		System.out.println(bilet2.toString());
	}

}
