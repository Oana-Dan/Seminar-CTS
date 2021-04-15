package ro.ase.cts.flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {
	private Map<String, FlyweigthAbstract> clienti;

	public FabricaRezervari() {
		super();
		this.clienti = new HashMap<String, FlyweigthAbstract>();
	}
	
	public FlyweigthAbstract getClient(String email)
	{
		FlyweigthAbstract client = clienti.get(email);
		if(client==null)
		{
			client = new Client("Alisa", "0728917254", email);
			clienti.put(email, client);
		}
		return client;
	}
	
}
