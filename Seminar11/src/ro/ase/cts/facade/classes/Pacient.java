package ro.ase.cts.facade.classes;

public class Pacient {
	private boolean esteInStareGrava;
	private String numePacient;
	
	public Pacient(boolean esteInStareGrava, String numePacient) {
		super();
		this.esteInStareGrava = esteInStareGrava;
		this.numePacient = numePacient;
	}

	public boolean isEsteInStareGrava() {
		return esteInStareGrava;
	}

	public void setEsteInStareGrava(boolean esteInStareGrava) {
		this.esteInStareGrava = esteInStareGrava;
	}

	public String getNumePacient() {
		return numePacient;
	}

	public void setNumePacient(String numePacient) {
		this.numePacient = numePacient;
	}

	@Override
	public String toString() {
		return "Pacient [esteInStareGrava=" + esteInStareGrava + ", numePacient=" + numePacient + "]";
	}
}
