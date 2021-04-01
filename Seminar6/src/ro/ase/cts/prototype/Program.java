package ro.ase.cts.prototype;

public class Program {

	public static void main(String[] args) {
		Client client = new Client(100, "Mihai", 18);
		Client copieClient =(Client) client.copiaza();
		
		System.out.println(client.toString());
		System.out.println(copieClient.toString());
		
		Bilet bilet1 = new Bilet(0, "echipa1", "echipa2", "25.04.2021");
		Bilet bilet2 = (Bilet) bilet1.copiaza();
		bilet2.setCod(1);
		Bilet bilet3 = (Bilet) bilet1.copiaza();
		bilet3.setCod(2);
		
		System.out.println(bilet2.toString());
		System.out.println(bilet3.toString());
	}

}
