package ro.ase.cts.chain.clase;

public class ContEconomii extends ContAbstract{

	public ContEconomii(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(suma<super.getSold()) {
			System.out.println("Se realizeaza plata din contul de economii");
			super.setSold(super.getSold()-suma);
		} else if(super.getCont()!=null) {
			super.getCont().realizeazaPlata(suma);
		} else {
			System.out.println("Plata refuzata");
		}
		
	}

}
