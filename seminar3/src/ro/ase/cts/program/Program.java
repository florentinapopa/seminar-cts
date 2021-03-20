package ro.ase.cts.program;

import ro.ase.cts.singleton.AsigurareMedicala;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsigurareMedicala asigurare=AsigurareMedicala.getInstance();
		AsigurareMedicala asigurare2=AsigurareMedicala.getInstance();
		asigurare.setContributie(70.0f);
		asigurare2.setId(10);
		System.out.println(asigurare.toString());
		System.out.println(asigurare2.toString());
		
		ro.ase.cts.singleton.lazy.AsigurareMedicala asigurareLazy=ro.ase.cts.singleton.lazy.AsigurareMedicala.getInstance(1, "abcd", 70.7f);
		ro.ase.cts.singleton.lazy.AsigurareMedicala asigurareLazy2=ro.ase.cts.singleton.lazy.AsigurareMedicala.getInstance(2, "efgh", 890.7f);
		System.out.println(asigurareLazy.toString());
		System.out.println(asigurareLazy2.toString());
		
	}

}
