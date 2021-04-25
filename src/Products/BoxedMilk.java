package Products;

public class BoxedMilk extends Product{

	public BoxedMilk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoxedMilk(int volume) {
		super(volume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BoxedMilk " + "volume: " + super.getVolume();
	}
	
}
