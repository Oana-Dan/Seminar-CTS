package ro.ase.cts.prototype;

public class Client implements AbstractPrototype{
	private int codClient;
	private String nume;
	private int varsta;
	
	//validare varsta
	public Client(int codClient, String nume, int varsta) {
		super();
		this.codClient = codClient;
		this.nume = nume;
		this.varsta = varsta;
	}
	
	private Client()
	{
		
	}
	
	@Override
	public String toString() {
		return "Client [codClient=" + codClient + ", nume=" + nume + ", varsta=" + varsta + "]";
	}

	@Override
	public AbstractPrototype copiaza() {
		Client client = new Client();
		client.codClient = this.codClient;
		client.nume = this.nume;
		client.varsta = this.varsta;
		
		return client;
	}
	
	
}
