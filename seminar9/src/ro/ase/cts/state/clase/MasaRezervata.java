package ro.ase.cts.state.clase;

public class MasaRezervata implements StareMasa{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof MasaLibera) {
			masa.setStare(this);
		}
	}

}
