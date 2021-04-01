package ro.ase.cts.classes.v1builder;

public class Builder implements IBuilder{
	private Rezervare rezervare;
	
	public Builder()
	{
		rezervare = new Rezervare(false, false, false, false, "gen", 1);
	}
	
	public Builder(int codRezervare)
	{
		rezervare = new Rezervare(false, false, false, false, "gen", codRezervare);
	}
	
	public Builder setMancareinclusa(boolean mancareinclusa) {
		rezervare.setMancareinclusa(mancareinclusa);
		return this;
	}
	
	public Builder setScaunErgonomic(boolean scaunErgonomic) {
		rezervare.setScaunErgonomic(scaunErgonomic);
		return this;
		}
	
	public Builder setBauturaRacoritoare(boolean bauturaRacoritoare) {
		rezervare.setBauturaRacoritoare(bauturaRacoritoare);
		return this;
	}
	
	public Builder setMuzicaAmbientala(boolean muzicaAmbientala) {
		rezervare.setMuzicaAmbientala(muzicaAmbientala);
		return this;
	}
	
	public Builder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
	public Builder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}


	@Override
	public Rezervare build() {
		return rezervare;
	}
	
}
