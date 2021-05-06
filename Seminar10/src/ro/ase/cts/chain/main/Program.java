package ro.ase.cts.chain.main;

import ro.ase.cts.chain.classes.Cont;
import ro.ase.cts.chain.classes.ContCredit;
import ro.ase.cts.chain.classes.ContCurent;
import ro.ase.cts.chain.classes.ContEconomii;
import ro.ase.cts.chain.classes.ContIndisponibil;

public class Program {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent(1500, "Madalin", null );
		Cont contEconomii = new ContEconomii(2500, "Madalin", null);
		Cont contCredit = new ContCredit(3200, "Madalin", null);
		Cont contIndisponibil = new ContIndisponibil("Madalin");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		contCurent.plateste(500);
		contCurent.plateste(2000);
		contCurent.plateste(3500);
	}
}
