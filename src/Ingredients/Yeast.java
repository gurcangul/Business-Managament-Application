package Ingredients;

public class Yeast extends RawMaterial{

	public Yeast() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Yeast(int volume) {
		super(volume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Yeast " + "volume: " +super.getVolume();
	}
	
}
