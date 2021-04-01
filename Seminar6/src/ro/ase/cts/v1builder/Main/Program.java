package ro.ase.cts.v1builder.Main;

import ro.ase.cts.classes.v1builder.Builder;
import ro.ase.cts.classes.v1builder.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Builder().setCodRezervare(2).setBauturaRacoritoare(true).build();
		
		System.out.println(rezervare1.toString());
		
		Rezervare rezervare2 = new Builder().setCodRezervare(3).setMancareinclusa(true).build();
		
		System.out.println(rezervare2.toString());
	}

}
