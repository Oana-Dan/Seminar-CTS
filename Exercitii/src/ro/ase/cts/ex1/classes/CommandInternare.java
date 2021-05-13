package ro.ase.cts.ex1.classes;

import java.util.ArrayList;

public class CommandInternare implements Command{
	private PrimireUrgente primireUrgente;
	
	public CommandInternare(PrimireUrgente primireUrgente) {
		super();
		this.primireUrgente = primireUrgente;
	}

	@Override
	public void executa() {
		primireUrgente.interneaza();
	}
}
