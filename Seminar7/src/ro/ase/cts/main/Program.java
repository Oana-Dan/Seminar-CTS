package ro.ase.cts.main;

import ro.ase.cts.adapter.classes.AdapterCreditClasa;
import ro.ase.cts.adapter.classes.AdapterCreditObiect;
import ro.ase.cts.adapter.classes.InterfataCredit;
import ro.ase.cts.adapter.classes.Leasing;

public class Program {

	public static void oferaInfoCredit(InterfataCredit credit, String nume, float suma)
	{
		credit.acordaCredit(nume, suma);
	}
	
	public static void main(String[] args) {
		Leasing leasing = new Leasing();
		AdapterCreditObiect adapter = new AdapterCreditObiect(leasing);
		oferaInfoCredit(adapter, "Ionel" , 245.50f);
		
		AdapterCreditClasa adapterClasa = new AdapterCreditClasa();
		oferaInfoCredit(adapterClasa, "Gigel", 322.43f);

	}

}
