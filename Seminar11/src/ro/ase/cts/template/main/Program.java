package ro.ase.cts.template.main;

import ro.ase.cts.template.Spectator;
import ro.ase.cts.template.SpectatorAbstract;
import ro.ase.cts.template.SpectatorPeluza;

public class Program {
	 public static void main(String[] args) {
	        SpectatorAbstract spectator=new Spectator();
	        spectator.intrareSpectatorPeStadion();

	        SpectatorAbstract spectatorPeluza=new SpectatorPeluza();
	        spectatorPeluza.intrareSpectatorPeStadion();
	    }
}
