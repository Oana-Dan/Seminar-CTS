package ro.ase.cts.ex1.classes;

import java.util.ArrayList;

public class Operator {
	private ArrayList<Command> listaComenziInternare;
	private ArrayList<Command> listaComenziTratareImediata;
	
	public Operator() {
		listaComenziInternare = new ArrayList<Command>();
		listaComenziTratareImediata = new ArrayList<Command>();
	}
	
	public void adaugaPacientListaInternare(Command command) {
		listaComenziInternare.add(command);
	}
	
	public void adaugaPacientListaTratare(Command command) {
		listaComenziTratareImediata.add(command);
	}
	
	public void invoca() {
		if(listaComenziTratareImediata.size() > 0) {
			for(Command command:listaComenziTratareImediata) {
				command.executa();
			}
		}
		if(listaComenziInternare.size() > 0) {
			for(Command command:listaComenziInternare) {
				command.executa();
			}
		}
	}
}
