package part2;
import java.util.ArrayList;
import java.util.Scanner;

public class ProceduralFoodMenu {

	// Printing Food Menu
	@SuppressWarnings("resource")
	public static int foodMenu() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose your desired option: ");
		System.out.println("1. Cheese Burger Combo - 4 JDs");
		System.out.println("2. Hotdog Combo - 3 JDs");
		System.out.println("3. Cheese Burger Sandwich - 3 JDs");
		System.out.println("4. Hotdog Sandwich - 2 JDs");
		System.out.println("5. Fries - 0.5 JDs");
		System.out.println("6. 7up - 0.4 JDs");
		System.out.println("7. Pepsi - 0.4 JDs");
		System.out.println("8. Done.");
		System.out.print("Choice -> ");
		
		return scanner.nextInt();
		
	}
	
	// Adding prices function
	public static double addToOrder(int choice) {

		
		double price = 0;
		
		switch (choice) {
		
			case 1: price = 4; break;
			case 2: price = 3; break;
			case 3: price = 3; break;
			case 4: price = 2; break;
			case 5: price = 0.5; break;
			case 6: price = 0.4; break;
			case 7: price = 0.4; break;
			default: price = 0;
		
		}
		
		return price;
	}
	
	// Adding the orders to the total.
	public static String orderList(int choice) {
		
		switch(choice) {
		
			case 1: return "Cheese Burger Combo";
			case 2: return "Hotdog Combo";
			case 3: return "Cheese Burger Sandwich";
			case 4: return "Hotdog Sandwich";
			case 5: return "Fries";
			case 6: return "7up";
			case 7: return "Pepsi";
			default: return "" ;
		
		}
		
	}
	
	public static void main(String[] args) {
		
		int choiceOption = 0, numOfItems = 0;
		double price = 0;
		ArrayList<String> orderReceipt = new ArrayList<String>();
		
		// Printing main menu
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("** Yazan's Burger and Hotdog Shop **");
		choiceOption = foodMenu();
		price += addToOrder(choiceOption);
		orderReceipt.add(orderList(choiceOption));
		numOfItems++;
		
		// Taking up to 100 items into the order or until choosing done.
		
		while (choiceOption != 8 && numOfItems < 100) {
			
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Anything else?");
			choiceOption = foodMenu();
			
			if (choiceOption > 8 || choiceOption <= 0) 
				continue;
			
			price += addToOrder(choiceOption);
			orderReceipt.add(orderList(choiceOption));
			numOfItems++;
			
		}
		
		// Printing out the order receipt and total.
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("** Yazan's Burger and Hotdog Shop **");
		
		System.out.println("\nYour order:\n");
		
		for (int i = 0; i < orderReceipt.size(); i++) {
			
			System.out.println(orderReceipt.get(i));
			
		}
		
		
		System.out.println("Your total is: " + price + " JDs");
		System.out.println("Sa77a w Hanna <3");

	}

}
