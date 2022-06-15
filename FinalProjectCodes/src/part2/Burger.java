package part2;


// The class inherits the food class therefore we just used the methods from the super class.
public class Burger extends Food {
	
	private int numOfPatties = 1;
	
	// Constructors
	
	public Burger() {
	
	}
	
	public Burger(String meatType) {
		
		super(meatType);
		
	}
	
	public Burger(String meatType, int weight) {
		
		super(meatType, weight);
		
	}
	
	public Burger(String meatType, int weight, int numOfPatties) {
		
		super(meatType, weight);
		this.numOfPatties = numOfPatties;
		
	}

	// Setters & Getters
	
	public int getNumOfPatties() {
		return numOfPatties;
	}

	public void setNumOfPatties(int numOfPatties) {
		this.numOfPatties = numOfPatties;
	}
	
	

}
