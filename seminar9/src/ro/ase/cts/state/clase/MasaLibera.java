package ro.ase.cts.state.clase;

public class MasaLibera implements StareMasa{

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStare() instanceof MasaLibera)) {
			masa.setStare(this);
		}
	}

}
