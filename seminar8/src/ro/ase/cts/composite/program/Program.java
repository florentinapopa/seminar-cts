package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Program {

	public static void main(String[] args) {
		Sectiune sectiuneStarter=new Sectiune("starter");
		Sectiune sectiuneBauturi=new Sectiune("bauturi");
		
		Item cola=new Item("Cola");
		Item fanta=new Item("Fanta");
		Item bruschete=new Item("Bruschete");
		Item foccacia=new Item("Foccacia");
		
		try {
			sectiuneBauturi.adaugaComponenta(fanta);
			sectiuneBauturi.adaugaComponenta(cola);
			sectiuneStarter.adaugaComponenta(bruschete);
			sectiuneStarter.adaugaComponenta(foccacia);
			
			Sectiune meniu=new Sectiune("Meniu");
			meniu.adaugaComponenta(sectiuneBauturi);
			meniu.adaugaComponenta(sectiuneStarter);
			meniu.afisareDescriere();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
