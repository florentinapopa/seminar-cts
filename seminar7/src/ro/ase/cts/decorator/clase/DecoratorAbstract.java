package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements CardAbstract{
	private CardAbstract cardAbstract;

	public DecoratorAbstract(CardAbstract cardAbstract) {
		super();
		this.cardAbstract = cardAbstract;
	}

	
	public CardAbstract getCardAbstract() {
		return cardAbstract;
	}


	@Override
	public void platesteOnline() {
		// TODO Auto-generated method stub
		cardAbstract.platesteOnline();
		
	}

	@Override
	public void platestePOS() {
		// TODO Auto-generated method stub
		cardAbstract.platestePOS();
	}
	
	public abstract void platesteContactless();

}
