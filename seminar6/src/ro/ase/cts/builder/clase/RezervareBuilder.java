package ro.ase.cts.builder.clase;

public class RezervareBuilder implements AbstractBuilder{

	private Rezervare rezervare;
	
	
	public RezervareBuilder() {
		super();
		rezervare=new Rezervare(0,false,false,false,false,"");
	}
	
	public RezervareBuilder(int cod) {
		rezervare=new Rezervare(cod,false,false,false,false,"");
	}

	public RezervareBuilder setCod(int cod) {
		rezervare.setCod(cod);
		return this;
	}
	
	public RezervareBuilder setAreMancareInclusa(boolean mancare) {
		rezervare.setAreMancareInclusa(mancare);
		return this;
	}
	
	public RezervareBuilder setAreBauturaInclusa(boolean bautura) {
		rezervare.setAreBauturaInclusa(bautura);
		return this;
	}
	
	public RezervareBuilder setAreScaunErgonomic(boolean scaun) {
		rezervare.setAreScaunErgonomic(scaun);
		return this;
	}
	
	public RezervareBuilder setAreMuzicaAmbientala(boolean muzica) {
		rezervare.setAreMuzicaAmbientala(muzica);
		return this;
	}
	
	public RezervareBuilder setGenMuzica(String gen) {
		rezervare.setGenMuzica(gen);
		return this;
	}

	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return this.rezervare;
	}
	

}
