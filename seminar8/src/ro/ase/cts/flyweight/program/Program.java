package ro.ase.cts.flyweight.program;



import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.ClientiFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rez1=new Rezervare(23, 2, 13);
		Rezervare rez2=new Rezervare(27, 5, 17);
		Rezervare rez3=new Rezervare(21, 3, 16);
		
		ClientiFactory factory=new ClientiFactory();
		
		Client client1=factory.getClient("client1");
		client1.printeazaInformatii(rez1);
		factory.getClient("client2").printeazaInformatii(rez2);
		
		factory.getClient("client1").printeazaInformatii(rez3);
	}

}
