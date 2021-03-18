package ro.ase.cts.od;

public class Model {
	private String nume;
	private float inaltime;
	private int varsta;
	private String numarTelefon;
	private static Model instanta = null;
	
	private Model(String nume, float inaltime, int varsta, String numarTelefon) {
		super();
		this.nume = nume;
		this.inaltime = inaltime;
		this.numarTelefon = numarTelefon;
		this.varsta = varsta;
	}
	
	public static synchronized Model getInstance(String nume, float inaltime,  int varsta, String numarTelefon)
	{
		if(instanta == null)
		{
			instanta = new Model(nume, inaltime, varsta, numarTelefon);
		}
		return instanta;
	}

	@Override
	public String toString() {
		return "Model [nume=" + nume + ", inaltime=" + inaltime + ", varsta=" + varsta + ", numarTelefon="
				+ numarTelefon + "]";
	}	
}
