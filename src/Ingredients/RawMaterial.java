package Ingredients;

public abstract class RawMaterial {
	private int volume;

	public RawMaterial(int volume) {
		this.volume = volume;
	}

	public RawMaterial() {
		volume = 0;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "RawMaterial volume=" + volume;
	}
	public void increaseVolume(int ivolume) {
		volume+=ivolume;
		
	}
	
	public void decreaseVolume(int dvolume) {
		volume-=dvolume;
		
	}
	
}
