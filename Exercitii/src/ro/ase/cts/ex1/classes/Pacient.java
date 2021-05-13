package ro.ase.cts.ex1.classes;

public class Pacient implements PrimireUrgente{
	private int cod;

	public Pacient(int cod) {
		super();
		this.cod = cod;
	}

	@Override
	public void interneaza() {
		System.out.println("Pacientul cu codul " + cod + " trebuie internat");	
	}

	@Override
	public void trateazaImediat() {
		System.out.println("Pacientul cu codul " + cod + " trebuie tratat imediat");
	}
}
