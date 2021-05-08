package ro.ase.cts.chain.clase;

public class ContBancar {
	private String titular;
	private float sold;
	
	public ContBancar(String titular) {
		super();
		this.titular = titular;
	}
	
	public void constituire(float s) {
		this.sold=s;
		System.out.println("Suma a fost constituita ");
	}
	
	public void depunere(float suma) {
		this.sold+=suma;
		System.out.println("S-a depus suma "+suma);
	}
	
	public void retragere(float s) {
		if(s<this.sold) {
			this.sold=this.sold-s;
			System.out.println("S-a retras suma "+s);
		} else {
			System.out.println("Fonduri insuficiente");
		}
	}
}
