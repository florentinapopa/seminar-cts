package ro.ase.cts.bilet.decorator.clase;

public class DecoratorUrare extends DecoratorAbstract{

	public DecoratorUrare(BiletAbstract biletAbstract) {
		super(biletAbstract);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void rezervaBilet() {
		// TODO Auto-generated method stub
		super.rezervaBilet();
		System.out.println("Paste fericit");
	}

}
