package ro.ase.cts.chain.clase;

public abstract class ContAbstract {
	private ContAbstract cont;
	private float sold;
	
	public ContAbstract(float sold) {
		super();
		this.sold = sold;
		this.cont=null;
	}

	public void setCont(ContAbstract cont) {
		this.cont = cont;
	}
	
	public void setSold(float sold) {
		this.sold = sold;
	}
	
	public ContAbstract getCont() {
		return cont;
	}
	
	public float getSold() {
		return sold;
	}
	
	public abstract void realizeazaPlata(float suma);
	
}
