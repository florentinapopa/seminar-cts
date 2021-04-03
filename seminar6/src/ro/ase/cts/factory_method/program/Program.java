package ro.ase.cts.factory_method.program;

import ro.ase.cts.factory_method.clase.AbstractFactory;
import ro.ase.cts.factory_method.clase.AtacantFactory;
import ro.ase.cts.factory_method.clase.Jucator;
import ro.ase.cts.factory_method.clase.MijlocasFactory;
import ro.ase.cts.factory_method.clase.PortarFactory;

public class Program {
	
	public static void afisareInformatiiJucator(AbstractFactory factory,String nume, int nr) {
		Jucator jucator=factory.getJucator(nume, nr);
		System.out.println(jucator.toString());
	}

	public static void main(String[] args) {
		afisareInformatiiJucator(new AtacantFactory(), "Bogdan", 10);
		afisareInformatiiJucator(new PortarFactory(), "Vlad", 8);
		afisareInformatiiJucator(new MijlocasFactory(), "Ionut", 11);
	}

}
