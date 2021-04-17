package ro.ase.cts.facade.clase;

public class FacadeMese {
	public static boolean potInvitaLaMasa(Masa masa) {
		if(OperatorMese.esteLibera(masa)) {
			Picolo cristi=new Picolo("Cristi");
			if(cristi.esteDebarasata(masa)&&cristi.esteAranjata(masa)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
