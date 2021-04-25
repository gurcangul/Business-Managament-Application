package Facilities;

public abstract class Storage {
	private int volume;
	
	public Storage() {
		volume = 0;
	}
	public Storage(int amount) {
		this.volume = amount;
		if(volume>10000)
			System.out.println("Bütün hacmi 10000 geçtiniz");
	}

	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public boolean addItem(int amount) {
		boolean done = false;
		if((volume + amount)>10000) {
			System.out.println("You cannot store theses items at the same time");
		}
		else {
			volume+= amount;
			done = true;
		}	
		return done;
	}
	
	public boolean delItem(int amount) {
		boolean done = false;
		if((volume - amount)<=0)
			System.out.println("You cannot delete theses items at the same time");
		else {
			volume-= amount;
			done = true;
		}
		return done;
	}
	@Override
	public String toString() {
		return "StorageTank " + "volume=" + volume ;
	}
		
}
