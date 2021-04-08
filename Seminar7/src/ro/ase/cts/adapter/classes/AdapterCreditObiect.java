package ro.ase.cts.adapter.classes;

public class AdapterCreditObiect implements InterfataCredit{
	private Leasing leasing;

	public AdapterCreditObiect(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		this.leasing.oferaLeasing(numeClient, suma);		
	}
}
