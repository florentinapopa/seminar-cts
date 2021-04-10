package ro.ase.cts.bilet.decorator.clase;

public class DecoratorSustinere extends DecoratorAbstract {

	public DecoratorSustinere(BiletAbstract biletAbstract) {
		super(biletAbstract);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rezervaBilet() {
		// TODO Auto-generated method stub
		super.rezervaBilet();
		System.out.println("Sustinem "+super.getEchipaGazda());
	}
	
}
