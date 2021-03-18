package ro.ase.cts.lazyinitialization;

public class ClinicaVeterinaraLazy {
	private static ClinicaVeterinaraLazy instanta = null;
	private String nume;
	private String adresa;
	private int numarDoctori;
	private float buget;
	
	public ClinicaVeterinaraLazy(String nume, String adresa, int numarDoctori, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.numarDoctori = numarDoctori;
		this.buget = buget;
	}

	public static synchronized ClinicaVeterinaraLazy getInstance(String nume, String adresa, int numarDoctori, float buget)
	{
		if(instanta == null)
		{
			instanta = new ClinicaVeterinaraLazy(nume, adresa, numarDoctori, buget);
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "ClinicaVeterinaraLazy [nume=" + nume + ", adresa=" + adresa + ", numarDoctori=" + numarDoctori
				+ ", buget=" + buget + "]";
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
