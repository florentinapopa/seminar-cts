package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	
	private int clasa;
	private String tutore;
	
	public int getClasa() {
		return clasa;
	}
	
	public void setClasa(int clasa) {
		this.clasa = clasa;
	}
	
	public String getTutore() {
		return tutore;
	}
	
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		final StringBuilder builder=new StringBuilder("Elev:");
		builder.append(super.toString());
		builder.append(", clasa=");
		builder.append(clasa);
		builder.append(", tutore=");
		builder.append(tutore);
		return builder.toString();
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public String finantare() {
		final StringBuilder builder=new StringBuilder("Student:");
		builder.append(super.finantare());
		builder.append("primeste suma de ");
		builder.append(Constanta.FINANTARE_ELEV);
		builder.append("Euro/zi pe proiect");
		return builder.toString();
	}
	
}
