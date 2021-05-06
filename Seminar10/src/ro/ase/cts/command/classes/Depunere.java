package ro.ase.cts.command.classes;

public class Depunere extends Command{

	public Depunere(ContBancar cont, float suma) {
		super(cont, suma);
	}

	@Override
	public void executa() {
		super.getCont().depunere(super.getSuma());	
	}
}
