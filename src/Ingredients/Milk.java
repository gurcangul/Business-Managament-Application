package Ingredients;

public class Milk extends RawMaterial {

	public Milk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Milk(int volume) {
		super(volume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Milk " +"volume: "+ super.getVolume();
	}
	
}


