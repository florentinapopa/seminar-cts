package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	
	private String ocupatie;
	private int salariu;
	
	public String getOcupatie() {
		return ocupatie;
	}
	
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	
	public int getSalariu() {
		return salariu;
	}
	
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	
	public Angajat() {
		super();	
	}
	
	@Override
	public String toString() {
		final StringBuilder builder=new StringBuilder("Angajat:");
		builder.append(super.toString());
		builder.append(", ocupatie=");
		builder.append(ocupatie);
		builder.append(", salariu=");
		builder.append(salariu);
		return builder.toString();
	}
	
	
	public String finantare() {
		final StringBuilder builder=new StringBuilder("Student:");
		builder.append(super.finantare());
		builder.append("primeste suma de ");
		builder.append(Constanta.FINANTARE_ANGAJAT);
		builder.append("Euro/zi pe proiect");
		return builder.toString();
	}
}
