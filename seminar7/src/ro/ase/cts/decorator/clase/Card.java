package ro.ase.cts.decorator.clase;

public class Card implements CardAbstract{
	private String titular;
	private String numarCard;
	public Card(String titular, String numarCard) {
		super();
		this.titular = titular;
		this.numarCard = numarCard;
	}
	
	
	public String getTitular() {
		return titular;
	}


	public String getNumarCard() {
		return numarCard;
	}


	@Override
	public void platesteOnline() {
		// TODO Auto-generated method stub
		System.out.println(this.titular+" a realizat o plata online.");
		
	}
	@Override
	public void platestePOS() {
		// TODO Auto-generated method stub
		System.out.println(this.titular+" a realizat o plata la POS.");
	}
	
	
}
