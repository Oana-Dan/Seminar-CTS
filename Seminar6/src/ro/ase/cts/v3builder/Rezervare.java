package ro.ase.cts.v3builder;

import ro.ase.cts.classes.v1builder.Builder;

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
	public Rezervare(Builder builder) {
		super();
		this.mancareinclusa = builder.mancareinclusa;
		this.scaunErgonomic = builder.scaunErgonomic;
		this.bauturaRacoritoare = builder.bauturaRacoritoare;
		this.muzicaAmbientala = builder.muzicaAmbientala;
		this.genMuzica = builder.genMuzica;
		this.codRezervare = builder.codRezervare;
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
	
	public static Builder builder()
	{
		return new Builder();
	}
	public static class Builder implements IBuilder
	{
		private boolean mancareinclusa;
		private boolean scaunErgonomic;
		private boolean bauturaRacoritoare;
		private boolean muzicaAmbientala;
		private String genMuzica;
		private int codRezervare;
		
		public Builder setMancareinclusa(boolean mancareinclusa) {
			this.mancareinclusa = mancareinclusa;
			return this;
		}
		
		public Builder setScaunErgonomic(boolean scaunErgonomic) {
			this.scaunErgonomic = scaunErgonomic;
			return this;
			}
		
		public Builder setBauturaRacoritoare(boolean bauturaRacoritoare) {
			this.bauturaRacoritoare = bauturaRacoritoare;
			return this;
		}
		
		public Builder setMuzicaAmbientala(boolean muzicaAmbientala) {
			this.muzicaAmbientala = muzicaAmbientala;
			return this;
		}
		
		public Builder setGenMuzica(String genMuzica) {
			this.genMuzica = genMuzica;
			return this;
		}
		
		public Builder setCodRezervare(int codRezervare) {
			this.codRezervare = codRezervare;
			return this;
		}

		@Override
		public Rezervare build() {
			return new Rezervare(this);
		}
	}
}
