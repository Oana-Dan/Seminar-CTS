package ro.ase.cts.decorator.classes;

public class ConcreteDecorator extends AbstractDecorator{

	public ConcreteDecorator(ICard icard) {
		super(icard);
	}

	@Override
	public void platesteContactLess() {
		System.out.println(super.getIcard().getDetinator() + " plateste contactless");
	}	
}
