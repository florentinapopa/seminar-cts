package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;
import ro.ase.cts.builder.clase.RezervareBuilderV2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare=new Rezervare(1,true,true,false,false,"jazz");
		System.out.println(rezervare.toString());
		Rezervare rezervare2=new RezervareBuilder().setCod(10).setAreBauturaInclusa(true).setAreMuzicaAmbientala(true).build();
		System.out.println(rezervare2.toString());
		Rezervare rezervare3=new RezervareBuilder().setCod(11).setAreScaunErgonomic(true).build();
		Rezervare rezervare4=new RezervareBuilder(12).setGenMuzica("pop").build();
		System.out.println(rezervare3.toString());
		System.out.println(rezervare4.toString());
		
		RezervareBuilder builder=new RezervareBuilder();
		Rezervare r1;
		Rezervare r2;
		r1=builder.setCod(13).setGenMuzica("jazz").build();
		r2=builder.setCod(14).build();
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		
		RezervareBuilderV2 builder2=new RezervareBuilderV2().setAreBauturaInclusa(true).setAreMancareInclusa(true);
		Rezervare rezervare5=builder2.setCod(23).build();
		Rezervare rezervare6=builder2.setCod(83).build();
		System.out.println(rezervare5.toString());
		System.out.println(rezervare6.toString());
		
	}

}
