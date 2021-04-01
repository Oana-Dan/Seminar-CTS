package ro.ase.cts.classes.v1builder;

public class Rezervare {
	private boolean mancareinclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	@Override
	public String toString() {
		return "Rezervare [mancareinclusa=" + mancareinclusa + ", scaunErgonomic=" + scaunErgonomic
				+ ", bauturaRacoritoare=" + bauturaRacoritoare + ", muzicaAmbientala=" + muzicaAmbientala
				+ ", genMuzica=" + genMuzica + ", codRezervare=" + codRezervare + "]";
	}
	public Rezervare(boolean mancareinclusa, boolean scaunErgonomic, boolean bauturaRacoritoare,
			boolean muzicaAmbientala, String genMuzica, int codRezervare) {
		super();
		this.mancareinclusa = mancareinclusa;
		this.scaunErgonomic = scaunErgonomic;
		this.bauturaRacoritoare = bauturaRacoritoare;
		this.muzicaAmbientala = muzicaAmbientala;
		this.genMuzica = genMuzica;
		this.codRezervare = codRezervare;
	}
	public boolean isMancareinclusa() {
		return mancareinclusa;
	}
	public void setMancareinclusa(boolean mancareinclusa) {
		this.mancareinclusa = mancareinclusa;
	}
	public boolean isScaunErgonomic() {
		return scaunErgonomic;
	}
	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}
	public boolean isBauturaRacoritoare() {
		return bauturaRacoritoare;
	}
	public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
	}
	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}
	public void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}
	public String getGenMuzica() {
		return genMuzica;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	public int getCodRezervare() {
		return codRezervare;
	}
	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	
	
}
