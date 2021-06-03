package ro.ase.cts.classes;

import java.util.List;

public class FakeStudent implements IStudent{
	private String nume;
	private float medie;
	private boolean areRestante;
	
	
	public FakeStudent(String nume, float medie, boolean areRestante) {
		super();
		this.nume = nume;
		this.medie = medie;
		this.areRestante = areRestante;
	}
	
	public FakeStudent() {
		
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return nume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return medie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return areRestante;
	}

	public void setMedie(float medie) {
		this.medie = medie;
	}

	public void setAreRestante(boolean areRestante) {
		this.areRestante = areRestante;
	}

}
