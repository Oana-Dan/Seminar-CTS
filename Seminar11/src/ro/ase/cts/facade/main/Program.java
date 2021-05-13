package ro.ase.cts.facade.main;

import ro.ase.cts.facade.classes.FacadeInternarePacient;
import ro.ase.cts.facade.classes.Pacient;

public class Program {

	public static void main(String[] args) {
		Pacient p1 = new Pacient(false, "Dani");
		Pacient p2 = new Pacient(true, "Catalin");
		
		System.out.println(FacadeInternarePacient.verificaPacient(p1));
		System.out.println(FacadeInternarePacient.verificaPacient(p2));
	}
}
