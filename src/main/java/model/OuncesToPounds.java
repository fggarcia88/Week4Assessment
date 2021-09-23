package model;


/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
public class OuncesToPounds {
	private int totalOunces;
	private int pounds;
	private int ounces;
	private final int OUNCES_IN_POUNDS = 16;
	
	public OuncesToPounds() {
		super();
	}
	
	public OuncesToPounds (int totalOunces){
		super();
		this.totalOunces = totalOunces;
		setPoundsOunces(totalOunces);
	}

	public int getPounds() {
		return pounds;
	}

	public int getOunces() {
		return ounces;
	}	

	public int getTotalOunces() {
		return totalOunces;
	}

	public void setPoundsOunces(int ounces) {
		this.ounces = ounces % OUNCES_IN_POUNDS;
		this.pounds = ounces / OUNCES_IN_POUNDS;
	}

	@Override
	public String toString() {
		return "OuncesToPounds [totalOunces=" + totalOunces + ", pounds=" + pounds + ", ounces=" + ounces + "]";
	}
	
	
}
