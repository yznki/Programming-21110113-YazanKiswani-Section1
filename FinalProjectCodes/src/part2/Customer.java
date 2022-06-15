package part2;

public class Customer {

	private String name;
	private int age;
	
	// Constructors
	
	public Customer() {
		
	}
	
	public Customer(String name) {
		
		this.name = name;
		
	}
	
	public Customer(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	// Setters & Getters - Encapsulation

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	// Methods
	
	public static void orderFood() {
		
		System.out.println("What would you like, A burger (3 JDs) or a hotdog (2 JDs)?");
		
	}
	
	
	
}
