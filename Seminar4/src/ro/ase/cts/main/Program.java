package ro.ase.cts.main;

import ro.ase.cts.classes.ClinicaVeterinara;
import ro.ase.cts.lazyinitialization.ClinicaVeterinaraLazy;
import ro.ase.cts.od.Model;

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
		
		clinica1.setNume("Clinica1");
		clinica2.setNumarDoctori(45);
		
		System.out.println(clinica1.toString());
		System.out.println(clinica2.toString());
		
		Model model1 = Model.getInstance("Ana" , 1.75f, 22, "0722445623");
		Model model2 = Model.getInstance("Maria", 1.73f, 23, "0746297845");
		
		System.out.println(model1.toString());
		System.out.println(model2.toString());
	}

}
