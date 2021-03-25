package ro.ase.cts.factoryMethodMain;

import ro.ase.cts.factoryMethod.Categorie;
import ro.ase.cts.factoryMethod.FactoryBody;
import ro.ase.cts.factoryMethod.FactoryCategorie;
import ro.ase.cts.factoryMethod.FactoryDurere;
import ro.ase.cts.factoryMethod.FactoryGripa;

public class Program {

	public static FactoryCategorie getTipFactory()
	{
		return new FactoryGripa();
	}
	
	public static void printeazaCategorie(FactoryCategorie factoryCategorie, float pret)
	{
		Categorie categorie = factoryCategorie.createCategorie(pret);
		System.out.println(categorie.toString());
	}
	
	public static void main(String[] args) {
		printeazaCategorie(getTipFactory(), 10);
	}

}
