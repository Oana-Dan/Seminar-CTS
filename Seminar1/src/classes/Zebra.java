package classes;

public class Zebra extends Animal{
	private int no_stripes;

	public Zebra(String name, float greutate, int no_stripes) {
		super(name, greutate);
		this.no_stripes = no_stripes;
	}

	public Zebra(String name, float greutate) {
		super(name, greutate);
		// TODO Auto-generated constructor stub
	}

	public int getNo_stripes() {
		return no_stripes;
	}

	public void setNo_stripes(int no_stripes) {
		this.no_stripes = no_stripes;
	}
	
	
}
