package ro.ase.cts.simpleFactory;

public class Body extends Categorie{

	public Body(float pretDeBaza) {
		super(pretDeBaza);
	}

	@Override
	public String toString() {
		return "Body [pretDeBaza=" + pretDeBaza + "]";
	}
}
