package ro.ase.cts.proxy.classes;

public class ProxyRezervare implements IRezervare{
	private static final int NR_MINIM_PERSOANE = 4;
	private Rezervare rezervare;
	
	public ProxyRezervare(Rezervare rezervare) {
		super();
		this.rezervare = rezervare;
	}

	@Override
	public void rezerva() {
		if(rezervare.getNrPersoane() >= NR_MINIM_PERSOANE)
		{
			rezervare.rezerva();
		}
		else
		{
			System.out.println("Persoanele pot veni fizic la restaurant");
		}
	}
}
