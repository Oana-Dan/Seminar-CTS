package ro.ase.cts.template;

public class Spectator extends SpectatorAbstract{

	@Override
	public void asezareLaCoada() {
		System.out.println("S-a asezat la coada");
	}

	@Override
	public void prezintaBilet() {
		System.err.println("A prezentat biletul");
	}

	@Override
	public void realizeazaControlCorporal() {
		System.out.println("s-a realizat controlul corporal");
	}

	@Override
	public void intraPeStadion() {
		System.out.println("A intrat pe stadion");
	}

	@Override
	public void ocupaLoc() {
		System.out.println("a ocupat un loc");
	}
	
}
