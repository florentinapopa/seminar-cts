package ro.ase.cts.composite.clase;

import java.util.ArrayList;

public class Sectiune extends ComponentaMeniu{
	
	private ArrayList<ComponentaMeniu> listaComponente;

	public Sectiune(String nume) {
		super(nume);
		this.listaComponente=new ArrayList<>();
	}

	@Override
	public void afisareDescriere() {
		System.out.println("Sectiunea: "+this.getNume());
		for(ComponentaMeniu c:listaComponente) {
			c.afisareDescriere();
		}
	}

	@Override
	public ComponentaMeniu getComponente(int i) throws Exception {
		if(i <listaComponente.size() && i >= 0) {
			return listaComponente.get(i);
		}else {
			throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public void adaugaComponenta(ComponentaMeniu componentaMeniu) throws Exception {
		listaComponente.add(componentaMeniu);
		
	}

	@Override
	public void stergeComponenta(ComponentaMeniu componentaMeniu) throws Exception {
		listaComponente.remove(componentaMeniu);
		
	}

}
