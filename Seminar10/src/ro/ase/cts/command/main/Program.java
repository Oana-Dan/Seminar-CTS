package ro.ase.cts.command.main;

import ro.ase.cts.command.classes.Constituire;
import ro.ase.cts.command.classes.ContBancar;
import ro.ase.cts.command.classes.Depunere;
import ro.ase.cts.command.classes.ManagerComenzi;
import ro.ase.cts.command.classes.Retragere;

public class Program {

	public static void main(String[] args) {
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new Constituire(new ContBancar("Alisa"), 500));
		manager.executaComanda();
		manager.invoca(new Retragere(new ContBancar("Oana"), 200));

		manager.executaComanda();
		
		manager.invoca(new Depunere(new ContBancar("Cosmina"), 100));
		manager.executaComanda();
	}
}
