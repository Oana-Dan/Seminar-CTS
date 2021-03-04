package ro.ase.cts.main;

import ro.ase.cts.clase.*;
import java.io.FileNotFoundException;

import java.util.List;

import ro.ase.cts.utils.Utils;

public class Program {

	public static void main(String[] args) {
		List<Angajat> listaAngajati;
		try {
			listaAngajati = Utils.readAngajati("angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
