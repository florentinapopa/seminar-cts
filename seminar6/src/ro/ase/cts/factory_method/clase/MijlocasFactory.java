package ro.ase.cts.factory_method.clase;

public class MijlocasFactory implements AbstractFactory{

	@Override
	public Jucator getJucator(String nume, int nr) {
		return new Mijlocas(nume, nr);
	}

}
