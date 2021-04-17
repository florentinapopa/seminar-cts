package ro.ase.cts.flyweight.clase;

//flyweight concret-stare permanenta
public class Client implements FlyweightAbstract{
	private String nume;
	private int telefon;
	private String email;
	public Client(String nume, int telefon, String email) {
		super();
		this.nume = nume;
		this.telefon = telefon;
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=");
		builder.append(nume);
		builder.append(", telefon=");
		builder.append(telefon);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public void printeazaInformatii(Rezervare rezervare) {
		System.out.println(rezervare.toString()+ " "+this.toString());		
	}
	
	
}
