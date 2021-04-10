package ro.ase.cts.bilet.decorator.program;

import ro.ase.cts.bilet.decorator.clase.Bilet;
import ro.ase.cts.bilet.decorator.clase.DecoratorAbstract;
import ro.ase.cts.bilet.decorator.clase.DecoratorSustinere;
import ro.ase.cts.bilet.decorator.clase.DecoratorUrare;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bilet bilet=new Bilet("Steaua","Rapid");
		bilet.rezervaBilet();
		DecoratorAbstract meciInGhencea=new DecoratorSustinere(bilet);
		meciInGhencea.rezervaBilet();
		DecoratorAbstract meciDePaste=new DecoratorUrare(bilet);
		meciDePaste.rezervaBilet();
		System.out.println();
		DecoratorAbstract meciInGhenceaDePaste=new DecoratorUrare(meciInGhencea);
		meciInGhenceaDePaste.rezervaBilet();
	}

}
