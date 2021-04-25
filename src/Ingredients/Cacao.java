package Ingredients;

public class Cacao extends RawMaterial{

	public Cacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cacao(int volume) {
		super(volume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cacao " + "volume: "+ super.getVolume();
	}
	
}
