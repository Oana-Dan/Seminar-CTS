package ro.ase.cts.facade.classes;

public class Medic {
	private String nume;
	private String specializare;
	
	public boolean esteNecesaraInternarea(Pacient pacient) {
		return pacient.isEsteInStareGrava();
	}

	public Medic(String nume, String specializare) {
		super();
		this.nume = nume;
		this.specializare = specializare;
	}
}
