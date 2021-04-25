package Ingredients;

public class Cream extends RawMaterial{

	public Cream() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cream(int volume) {
		super(volume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cream " +"volume: " +super.getVolume();
	}
	
}
