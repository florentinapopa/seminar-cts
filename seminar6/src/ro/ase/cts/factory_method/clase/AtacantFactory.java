package ro.ase.cts.factory_method.clase;

public class AtacantFactory implements AbstractFactory{

	@Override
	public Jucator getJucator(String nume, int nr) {
		return new Atacant(nume, nr);
	}

}
