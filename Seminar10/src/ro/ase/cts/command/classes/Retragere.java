package ro.ase.cts.command.classes;

public class Retragere extends Command{

	public Retragere(ContBancar cont, float suma) {
		super(cont, suma);
	}

	@Override
	public void executa() {
		super.getCont().retragere(super.getSuma());
	}
}
