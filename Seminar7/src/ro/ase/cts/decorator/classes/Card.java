package ro.ase.cts.decorator.classes;

public class Card implements ICard{
	private String detinatorCard;
	
	public Card(String detinatorCard) {
		super();
		this.detinatorCard = detinatorCard;
	}

	@Override
	public void platesteOnline() {
		System.out.println(detinatorCard + " a platit online");
		
	}

	@Override
	public void platesteFizic() {
		System.out.println(detinatorCard + " a platit fizic");
		
	}

	public String getDetinatorCard() {
		return detinatorCard;
	}

	public void setDetinatorCard(String detinatorCard) {
		this.detinatorCard = detinatorCard;
	}

	@Override
	public String getDetinator() {
		return detinatorCard;
	}
}
