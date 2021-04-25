package Products;

public class Chocolate extends Product{

	public Chocolate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chocolate(int volume) {
		super(volume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Chocolate "+ "volume: " + super.getVolume();
	}
	
}
