package ro.ase.cts.composite.clase;

public class Item extends ComponentaMeniu{

	public Item(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afisareDescriere() {
		System.out.println("Item: "+this.getNume());
		
	}

	@Override
	public ComponentaMeniu getComponente(int i) throws Exception{
		throw new Exception("Eroare!");
	}

	@Override
	public void adaugaComponenta(ComponentaMeniu componentaMeniu) throws Exception{
		throw new Exception("Eroare!");
		
	}

	@Override
	public void stergeComponenta(ComponentaMeniu componentaMeniu) throws Exception{
		throw new Exception("Eroare!");
		
	}

}
