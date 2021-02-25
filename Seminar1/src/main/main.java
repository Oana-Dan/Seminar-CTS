package main;

import classes.Zoo;
import classes.Zookeeper;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		Zookeeper zookeeper = new Zookeeper("Dani");
		Zoo zoo = new Zoo();
		zoo.setZookeeper(zookeeper);
		
	}

}
