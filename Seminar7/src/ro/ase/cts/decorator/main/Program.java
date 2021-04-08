package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.classes.AbstractDecorator;
import ro.ase.cts.decorator.classes.Card;
import ro.ase.cts.decorator.classes.ConcreteDecorator;
import ro.ase.cts.decorator.classes.ICard;

public class Program {

	public static void main(String[] args) {
		ICard card = new Card("Maria");
		card.platesteFizic();
		card.platesteOnline();
		
		AbstractDecorator decorator = new ConcreteDecorator(card);
		decorator.platesteContactLess();
		
	}

}
