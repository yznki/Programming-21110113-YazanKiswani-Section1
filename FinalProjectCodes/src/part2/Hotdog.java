package part2;

//The class inherits the food class therefore we just used the methods from the super class.
public class Hotdog extends Food {
	
	private int numOfHotdogs = 1;

	// Constructors
	
	public Hotdog() {
		
	}
	
	public Hotdog(String meatType, int weight, int numOfHotdogs) {
		super(meatType, weight);
		this.numOfHotdogs = numOfHotdogs;
		
	}
	
	public Hotdog(String meatType, int weight) {
		super(meatType, weight);
		
	}

	public Hotdog(String meatType) {
		super(meatType);
		
	}
	
	// Setters & Getters

	public int getNumOfHotdogs() {
		return numOfHotdogs;
	}
	public void setNumOfHotdogs(int numOfHotdogs) {
		this.numOfHotdogs = numOfHotdogs;
	}
	
	

}
