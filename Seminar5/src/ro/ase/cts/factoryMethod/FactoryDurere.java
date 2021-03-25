package ro.ase.cts.factoryMethod;

public class FactoryDurere implements FactoryCategorie{

	@Override
	public Categorie createCategorie(float pret) {
		return new Durere(pret);
	}

}
