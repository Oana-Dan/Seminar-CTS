package ro.ase.cts.template;

public class SpectatorPeluza extends SpectatorAbstract{

	@Override
	public void asezareLaCoada() {
		System.out.println("spectatorul de peluza s-a asezat la coada");
	}

	@Override
	public void prezintaBilet() {
		System.out.println("spectatorul de peluza a prezentat biletul");
	}

	@Override
	public void realizeazaControlCorporal() {
		System.out.println("spectatorul de peluza a fost controlat");
	}

	@Override
	public void intraPeStadion() {
		System.out.println("spectatorul a intrat in peluza");
	}

	@Override
	public void ocupaLoc() {
		System.out.println("spectatorul de peluza a ocupat un loc");		
	}

}