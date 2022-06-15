package part2;

import java.util.ArrayList;
import java.util.Scanner;

public class Food {
	
	private int weight = 0;
	private String meatType = "";
	private ArrayList<String> extraIngredients = new ArrayList<String>();
	private double price = 0;

	
	// Constructors
	
	public Food() {
		
	}
	public Food(String meatType) {
		
		this.meatType = meatType;
		
	}
	public Food(String meatType, int weight) {
		
		this.meatType = meatType;
		this.weight = weight;
		
	}

	// Setters & Getters
	
	public void setWeight(int weight) {
		
		this.weight = weight;
		
	}
	public int getWeight() {
		
		return weight;
		
	}
	public void setMeatType(String meatType) {
		
		this.meatType = meatType;
		
	}
	public String getMeatType() {
		
		return meatType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ArrayList<String> getExtraIngredients() {
		return extraIngredients;
	}
	public void setExtraIngredients(ArrayList<String> extraIngredients) {
		this.extraIngredients = extraIngredients;
	}
	
	// Methods
	
	public void addIngredients() {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n\n\n");
			System.out.println("What would you like to add? If you finished adding extra ingredients type \"done\". ");
			String ingredient = scanner.nextLine();
			String ingredient_lower = ingredient.toLowerCase();
			
			if (ingredient_lower.equals("done")) {
				break;
			}
			else if (ingredient_lower.equals("")) {
				continue;
			}
			else {
				extraIngredients.add(ingredient);
			}
			
		}
		
	}
	public void makeCombo(boolean combo) {
		
		if (combo) {
			price += 0.5;
			
		}

	}
	
}
