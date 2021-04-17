package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.FacadeMese;
import ro.ase.cts.facade.clase.Masa;


public class Program {

	public static void main(String[] args) {
		Masa masa=new Masa(10,0);
		
		/*if(OperatorMese.esteLibera(masa)) {
			Picolo andrei=new Picolo("Andrei");
			if(andrei.esteDebarasata(masa)&&andrei.esteAranjata(masa)) {
				System.out.println("Poftiti la masa!");
			}else {
				System.out.println("Mai asteptati.");
			}
		} else {
			System.out.println("Mai asteptati");
		}*/
	
		Masa masa2=new Masa(31,0);
		if(FacadeMese.potInvitaLaMasa(masa2)) {
			System.out.println("Poftiti la masa!");
		} else {
			System.out.println("Mai asteptati");
		}

	}

}
