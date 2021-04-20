package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.OperatorRezervare;
import ro.ase.cts.proxy.clase.ProxyRezervare;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorRezervare operatorRezervare1=new OperatorRezervare("Spot");
		operatorRezervare1.rezerva(2);
		
		ProxyRezervare proxy=new ProxyRezervare(operatorRezervare1, 4);
		proxy.rezerva(2);
		proxy.rezerva(4);
	}

}
