package ro.ase.cts.facade.classes;

public class Pat {
	private int numarPat;
	private boolean liber;
	
	public Pat(int numarPat, boolean liber) {
		super();
		this.numarPat = numarPat;
		this.liber = liber;
	}

	public boolean isLiber() {
		return liber;
	}

	public void setLiber(boolean liber) {
		this.liber = liber;
	}

	public int getNumarPat() {
		return numarPat;
	}	
}
