package Facilities;

import java.util.LinkedList;
import java.util.Queue;

public class StorageArea{

	private Queue<Integer> area = new LinkedList<Integer>();
	private int volume;
	public StorageArea() {
		volume = 0;
		area.add(volume);
	}
	public StorageArea(int volume) {
		if(volume>10000) {
			System.out.println("Area is full");
		}
		this.volume = volume;
		area.add(volume);
	}
	
	public boolean addItem(int aitem) {
		boolean done = false;
		this.volume = area.poll();
		
		if((volume + aitem)>10000) {
			System.out.println("Area is full");
			
			
		}else {
			volume += aitem;
			done = true;
		}
		
		area.add(volume);
		return done;
		
	}
	
	public boolean dellItem(int ditem) {
		boolean done = false;
		this.volume = area.poll();
		
		if((volume - ditem)<0) {
			System.out.println("Area is empty");
		}
		else {
			volume -= ditem;
			done = true;
		}
		area.add(volume);
		return done;
	}
	
	public Queue<Integer> getArea() {
		return area;
	}
	public void setArea(Queue<Integer> area) {
		this.area = area;
	}
	public int getVolumeOfArea() {
		return area.peek();
	}
	@Override
	public String toString() {
		return "StorageArea area=" + area;
	}

}
