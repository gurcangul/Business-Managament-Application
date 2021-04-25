package Products;

public class Yogurt extends Product{

	public Yogurt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Yogurt(int volume) {
		super(volume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Yogurt "+ "volume: " + super.getVolume();
	}
	
}
