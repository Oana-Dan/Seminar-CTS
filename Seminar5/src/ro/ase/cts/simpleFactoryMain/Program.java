package ro.ase.cts.simpleFactoryMain;

import ro.ase.cts.simpleFactory.Categorie;
import ro.ase.cts.simpleFactory.CategorieFactory;
import ro.ase.cts.simpleFactory.CategoriiMedicamente;
import ro.ase.cts.simpleFactory.Durere;

public class Program {

	public static CategoriiMedicamente getTipCategorie() {
		return CategoriiMedicamente.raceala;
	}
	
	public static void main(String[] args) {
		try
		{
		CategorieFactory factory = new CategorieFactory();
		Categorie durere = factory.creareCategorie(CategoriiMedicamente.durere, 5);
		Categorie body = factory.creareCategorie(CategoriiMedicamente.body, 10);
		Categorie caetgorie = factory.creareCategorie(getTipCategorie(), 15);
		
		System.out.println(durere.toString());
		System.out.println(body.toString());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
