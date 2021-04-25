package Products;

public abstract class Product {
	private int volume;

	public Product(int volume) {
		this.volume = volume;
	}
	public Product() {
		volume = 0;
	}

	@Override
	public String toString() {
		return "Product volume=" + volume;
	}

	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
