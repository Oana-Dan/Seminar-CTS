package main;

import classes.Giraffe;
import classes.Zebra;
import classes.Zoo;
import classes.Zookeeper;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		Zookeeper zookeeper = new Zookeeper("Dani");
		Zoo zoo = new Zoo();
		zoo.setZookeeper(zookeeper);
		
		Giraffe g1 = new Giraffe("Girafa", 10);
		Giraffe g2 = new Giraffe("Girafa2", 15, 200);
		
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		
		zoo.feedAllAnimals();
		
		Zebra z1 = new Zebra("Zebra1", 7);
		Zebra z2 = new Zebra("Zebra2", 9, 132);
		
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		
		zoo.feedAllAnimals();
	}

}
