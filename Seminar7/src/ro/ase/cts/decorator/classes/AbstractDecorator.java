package ro.ase.cts.decorator.classes;

public abstract class AbstractDecorator implements ICard{
	private ICard icard;
	
	@Override
	public String getDetinator() {
		return icard.getDetinator();
	}

	public AbstractDecorator(ICard icard) {
		super();
		this.icard = icard;
	}

	@Override
	public void platesteOnline() {
		icard.platesteOnline();
	}

	@Override
	public void platesteFizic() {
		icard.platesteFizic();
	}
	
	public ICard getIcard() {
		return icard;
	}

	public void setIcard(ICard icard) {
		this.icard = icard;
	}

	public abstract void platesteContactLess();	
}
