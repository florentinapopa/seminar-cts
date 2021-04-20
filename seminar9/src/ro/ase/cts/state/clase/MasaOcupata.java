package ro.ase.cts.state.clase;

public class MasaOcupata implements StareMasa{

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStare() instanceof MasaRezervata)) {
			masa.setStare(this);
		}		
	}

}
