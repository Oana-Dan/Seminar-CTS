package ro.ase.cts.simpleFactory;

public class CategorieFactory {

	public Categorie creareCategorie(CategoriiMedicamente categoriiMedicamente, float pret) throws Exception
	{
		switch (categoriiMedicamente) {
			case raceala:
				return new Raceala(pret);
			case durere:
				return new Durere(pret);
			case body:
				return new Body(pret);
			default:
				throw new Exception("Categorie incorecta");
		}
	}
}
