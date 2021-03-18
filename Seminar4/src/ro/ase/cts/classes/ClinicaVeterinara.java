package ro.ase.cts.classes;

public class ClinicaVeterinara {
	//la eager initialization, instanta statica este initializata la momentul declararii	
	private static final ClinicaVeterinara clinicaVeterinara = new ClinicaVeterinara("Clinica Vet", "Strada Vet", 5, 30000.2f);
	private String nume;
	private String adresa;
	private int numarDoctori;
	private float buget;
	
	//constructorul trebuie sa fie obligatoriu private
	private ClinicaVeterinara(String nume, String adresa, int numarDoctori, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.numarDoctori = numarDoctori;
		this.buget = buget;
	}
	
	//functie statica care va returna instanta
	public static ClinicaVeterinara getInstance()
	{
		return clinicaVeterinara;
	}

	@Override
	public String toString() {
		return "ClinicaVeterinara [nume=" + nume + ", adresa=" + adresa + ", numarDoctori=" + numarDoctori + ", buget="
				+ buget + "]";
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getNumarDoctori() {
		return numarDoctori;
	}

	public void setNumarDoctori(int numarDoctori) {
		this.numarDoctori = numarDoctori;
	}

	public float getBuget() {
		return buget;
	}

	public void setBuget(float buget) {
		this.buget = buget;
	}
}
