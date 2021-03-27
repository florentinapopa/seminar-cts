package ro.ase.cts.simple_factory.program;

import ro.ase.cts.simple_factory.clase.AbstractJucator;
import ro.ase.cts.simple_factory.clase.FactorySingleton;
import ro.ase.cts.simple_factory.clase.JucatorFactory;
import ro.ase.cts.simple_factory.clase.TipJucator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorySingleton factorySingleton=FactorySingleton.getInstance();
		JucatorFactory factory=new JucatorFactory();
		AbstractJucator portar=factorySingleton.getJucator(TipJucator.PORTAR, "Bogdan", 20);
		AbstractJucator fundas=factorySingleton.getJucator(TipJucator.FUNDAS, "Vlad", 22);
		System.out.println(portar.toString());
		System.out.println(fundas.toString());

	}

}
