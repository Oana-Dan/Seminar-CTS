package ro.ase.cts.ex1.classes;

public class CommandTratareImediata implements Command{
	private PrimireUrgente primireUrgente; 
	
	public CommandTratareImediata(PrimireUrgente primireUrgente) {
		super();
		this.primireUrgente = primireUrgente;
	}
	
	@Override
	public void executa() {
		primireUrgente.trateazaImediat();
	}
}
