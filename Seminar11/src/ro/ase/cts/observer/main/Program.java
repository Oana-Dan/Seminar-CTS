package ro.ase.cts.observer.main;

import ro.ase.cts.observer.classes.ClientAbonat;
import ro.ase.cts.observer.classes.Sala;

public class Program {

	public static void main(String[] args) {
		ClientAbonat client1 = new ClientAbonat("Popescu");
		ClientAbonat client2 = new ClientAbonat("Vasilescu");
		ClientAbonat client3 = new ClientAbonat("Ionescu");
		
		Sala sala = new Sala("Sala sportiva");
		
		sala.aboneazaClient(client1);
		sala.aboneazaClient(client2);
		sala.aboneazaClient(client3);
		
		sala.anuntaMeciFotbal();
		sala.anuntaMeciVolei();
	}
}
