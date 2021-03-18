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

	public static ClinicaVeterinaraLazy getInstance(String nume, String adresa, int numarDoctori, float buget)
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
}
