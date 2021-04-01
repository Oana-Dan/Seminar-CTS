package ro.ase.cts.v2builder.Main;

import ro.ase.cts.v2builder.BuilderV2;
import ro.ase.cts.v2builder.Rezervare;

public class Program {

	public static void main(String[] args) {
		BuilderV2 builder = new BuilderV2();
		builder.setBauturaRacoritoare(true);
		builder.setMuzicaAmbientala(true);
		
		Rezervare rezervare1 = builder.setCodRezervare(1).build();
		Rezervare rezervare2 = builder.setCodRezervare(2).build();

		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
	}

}
