package part2;

import java.util.Scanner;

public class MainOOP {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		// Main Menu

		String foodType;

		Scanner scanner = new Scanner(System.in);
		Customer foodEater = new Customer();

		System.out.println("\n\n\n");
		System.out.println("** Yazan's Burger and Hotdog Shop **");

		System.out.println("Welcome, What is your name?");
		foodEater.setName(scanner.nextLine());

		System.out.println("How old are you? *for discount reasons ;)*");
		foodEater.setAge(Integer.parseInt(scanner.nextLine()));

		System.out.println();

		int optionValid = 0, numOfPatties = 0;
		String isCombo = "", hasExtra = "";

		// Ordering Process

		while (optionValid == 0) {

			System.out.println("\n\n\n");
			Customer.orderFood();
			foodType = scanner.nextLine();

		// Ordering of a burger.
			
			if (foodType.toLowerCase().equals("burger")) { 

				optionValid = 1;
				Burger burgerOrder = new Burger();
				burgerOrder.setPrice(3);
				
				// Only chicken or meat as input
				
				while (!(burgerOrder.getMeatType().toLowerCase().equals("chicken") || burgerOrder.getMeatType().toLowerCase().equals("meat"))) {
					
					System.out.println("What meat type would you like? (Chicken / Meat)");
					burgerOrder.setMeatType(scanner.nextLine());
					
				}

				// Only 150 or 300 for weight option
				
				while (burgerOrder.getWeight() != 150 && burgerOrder.getWeight() != 300) {

					System.out.println("What weight would you like? (150 or 300 (+1 JDs))");
					burgerOrder.setWeight(Integer.parseInt(scanner.nextLine()));

					if (burgerOrder.getWeight() == 150) {

						burgerOrder.setNumOfPatties(1);
						numOfPatties = 1;

					} else {
						burgerOrder.setNumOfPatties(2);
						numOfPatties = 2;
						burgerOrder.setPrice((burgerOrder.getPrice() + 1.0));
					}

				}

				System.out.println("Extra Ingredients? yes/no");
				String extraIngAns = scanner.nextLine();

				// Adding extra ingredients.
				
				if (extraIngAns.toLowerCase().equals("yes")) {

					burgerOrder.addIngredients(); // addIngredients method takes in an array of ingredients.
					System.out.println("\n\n\n");
					hasExtra = "with extra: ";

				}

				// Making the order a meal/combo.
				
				System.out.println("Make it a combo (extra 0.5JDs)? yes/no");
				String comboAns = scanner.nextLine();
				if (comboAns.toLowerCase().equals("yes")) {

					burgerOrder.makeCombo(true);
					isCombo = "combo ";

				}
				
				// Printing Total

				System.out.println("\n\n\n");
				System.out.println("** Yazan's Burger and Hotdog Shop **");

				System.out.println("\nYour order:\n");
				System.out.println(" - A burger " + isCombo + "(" + burgerOrder.getWeight() + "gm) " + hasExtra);

				for (int i = 0; i < burgerOrder.getExtraIngredients().size(); i++) {

					System.out.println(burgerOrder.getExtraIngredients().get(i));

				}

				// Discount for teenagers and kids.
				
				if (foodEater.getAge() < 18) {

					burgerOrder.setPrice((burgerOrder.getPrice() - 1.0));
					System.out.println("\nYou get a 1 JD discount!");
				}

				System.out.println("\nTotal of order : " + burgerOrder.getPrice() + " JDs.");

				
			// Ordering of a hot-dog.
				
				
			} else if (foodType.toLowerCase().equals("hotdog")) { 

				optionValid = 1;
				Hotdog hotdogOrder = new Hotdog();
				hotdogOrder.setPrice(2);
				
				// Only chicken or meat as input

				while (!(hotdogOrder.getMeatType().toLowerCase().equals("chicken") || hotdogOrder.getMeatType().toLowerCase().equals("meat"))) {
				
					System.out.println("What meat type would you like? (Chicken / Meat)");
					hotdogOrder.setMeatType(scanner.nextLine());

				}
				
				System.out.println("Extra Ingredients? yes/no");
				String extraIngAns = scanner.nextLine();

				// Adding extra ingredients.
				
				if (extraIngAns.toLowerCase().equals("yes")) {

					hotdogOrder.addIngredients();
					System.out.println("\n\n\n");
					hasExtra = "with extra: ";

				}

				// Making the order a meal/combo.
				
				System.out.println("Make it a combo (extra 0.5JDs)? yes/no");
				String comboAns = scanner.nextLine();

				if (comboAns.toLowerCase().equals("yes")) {

					hotdogOrder.makeCombo(true);
					isCombo = " combo ";

				}
				
				// Printing Total

				System.out.println("\n\n\n");
				System.out.println("** Yazan's Burger and Hotdog Shop **");

				System.out.println("\nYour order:\n");
				System.out.println(" - A hotdog" + isCombo + hasExtra);

				for (int i = 0; i < hotdogOrder.getExtraIngredients().size(); i++) {

					System.out.println(hotdogOrder.getExtraIngredients().get(i));

				}
				
				// Giving a discount to teenagers and kids.

				if (foodEater.getAge() < 18) {

					hotdogOrder.setPrice(hotdogOrder.getPrice() - 1);
					System.out.println("\nYou get a 1 JD discount!");
				}

				System.out.println("\nTotal of order : " + hotdogOrder.getPrice() + " JDs.");

			}
		}

	}

}
