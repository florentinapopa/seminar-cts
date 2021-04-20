package ro.ase.cts.proxy.clase;

public class OperatorRezervare implements IOperatorRezervari{

	private String restaurant;
	
	
	public OperatorRezervare(String restaurant) {
		super();
		this.restaurant = restaurant;
	}


	@Override
	public void rezerva(int nr) {
		// TODO Auto-generated method stub
		System.out.println("A fost realizata o rezervare pt "+nr+" la "+this.restaurant);
	}
	
}
