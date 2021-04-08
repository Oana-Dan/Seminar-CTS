package ro.ase.cts.adapter.classes;

public class AdapterCreditClasa extends Leasing implements InterfataCredit{

	public AdapterCreditClasa() {
		super();
	}
	
	@Override
	public void acordaCredit(String numeClient, float suma) {
		super.oferaLeasing(numeClient, suma);
		
	}

}
