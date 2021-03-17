package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numarProiecte;
	protected String[] denumiriProiecte;
		
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public void afiseazaStatus(Proiect proiect){
		System.out.println("Aplicantul " + nume + " " + prenume);
		if(punctaj>proiect.getPragAcceptare()){
			System.out.println("Aplicantul "+nume+" "+prenume+" a fost acceptat.");
			}
		else {
			System.out.println("Aplicantul "+nume+" "+prenume+" nu a fost acceptat.");
		}
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	public Aplicant() {
		super();
	}
	
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumiriProiecte) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numarProiecte = numarProiecte;
		this.denumiriProiecte = denumiriProiecte;
	}
	
	public int getNumarProiecte() {
		return numarProiecte;
	}
	
	public void setNumarProiecte(int numarProiecte, String[] vect) {
		this.numarProiecte = numarProiecte;
		for(int i = 0; i < numarProiecte; i++) {
			this.denumiriProiecte = vect;
		}	
	}
	
	@Override
	public String toString() {
		return "Aplicant [nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", punctaj=" + punctaj
				+ ", numarProiecte=" + numarProiecte + ", denumiriProiecte=" + Arrays.toString(denumiriProiecte) + "]";
	}
	
	public abstract float getSumaFinantata();
}
