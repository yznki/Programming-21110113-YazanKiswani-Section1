package lab10May;

public class Mobile {
	
	// Constructors
	
	Mobile() {
			
	}
	
	Mobile(String brand) {
		
		this.brand = brand;
		
	}
	
	Mobile(String brand, String color) {
	
		this.brand = brand;
		this.color = color;
		
	}
	
	
	Mobile(String brand, String color, int yearOfProduction) {
		
		this.brand = brand;
		this.color = color;
		this.yearOfProduction = yearOfProduction;
		
	}
	
	// Attributes
	
	private String brand;
	private String color;
	private int yearOfProduction;
	
	// Setters & Getters
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	
	// Methods
	
	
	void dialNumber(int phoneNumber) {
		
		System.out.println("Dialing " + phoneNumber);
		
	}
	
	static void getCall(String callersName) {
		
		System.out.println(callersName + " is calling you.");
		
	}
	
	void answerCall(boolean answer) {
		
		if (answer)
		{	
			System.out.println("You answered the call.");	
		}
		else
		{
			System.out.println("Call declined.");
		}
		
	}
	
}
