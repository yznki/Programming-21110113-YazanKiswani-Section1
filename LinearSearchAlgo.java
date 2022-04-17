import java.util.Scanner;

public class LinearSearchAlgo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arrOfNumbers = {1,24,65,86,97,65,53,3,12,4,56,87,98,76,54,4,32,21,4365,78,23};
		System.out.println("Which number to find? ");
		int key = scanner.nextInt(), counter = 1;
		boolean numFound = false;
		
		for (int i = 0; i < arrOfNumbers.length; i++) {
			if (arrOfNumbers[i] == key) {
				System.out.println("Number has been found " + counter + " time/s.");
				numFound = true;
				counter++;
				
			}
			
		}
		
		if (numFound == false) {
			System.out.println("Number hasn't been found.");
		}
		
	}

}
