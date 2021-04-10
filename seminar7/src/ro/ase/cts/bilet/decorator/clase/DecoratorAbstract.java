package ro.ase.cts.bilet.decorator.clase;

public abstract class DecoratorAbstract implements BiletAbstract{
	private BiletAbstract biletAbstract;
	

	public DecoratorAbstract(BiletAbstract biletAbstract) {
		super();
		this.biletAbstract = biletAbstract;
	}


	@Override
	public void rezervaBilet() {
		// TODO Auto-generated method stub
		biletAbstract.rezervaBilet();
		
	}


	@Override
	public String getEchipaGazda() {
		// TODO Auto-generated method stub
		return biletAbstract.getEchipaGazda();
	}


	@Override
	public String getEchipaAdversar() {
		// TODO Auto-generated method stub
		return biletAbstract.getEchipaAdversar();
	}
	

}
