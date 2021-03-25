package ro.ase.cts.factoryMethod;

public class FactoryRaceala implements FactoryCategorie{

	@Override
	public Categorie createCategorie(float pret) {
		return new Raceala(pret);
	}

}
