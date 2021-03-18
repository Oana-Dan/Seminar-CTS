package ro.ase.cts.main;

import ro.ase.cts.classes.ClinicaVeterinara;
import ro.ase.cts.lazyinitialization.ClinicaVeterinaraLazy;

public class Program {

	public static void main(String[] args) {
//		ClinicaVeterinara clinica1 = ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinica2 = ClinicaVeterinara.getInstance();
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
		ClinicaVeterinaraLazy clinica1 = ClinicaVeterinaraLazy.getInstance("ClinVet", "Strada Independentei", 4, 4500.45f);
		ClinicaVeterinaraLazy clinica2 = ClinicaVeterinaraLazy.getInstance("VetClin", "Strada Libertatii", 5, 2500.45f);
		
		System.out.println(clinica1.toString());
		System.out.println(clinica2.toString());
	}

}
