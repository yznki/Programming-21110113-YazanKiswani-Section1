package part1;
import java.util.Scanner;

	public class Part1 {

		@SuppressWarnings("resource")
		static int binaryToDecimal(){
			
			Scanner scanner = new Scanner(System.in);
			
			int decimal = 0, base = 1;
			long binary = 0;
			
			try {
				
				System.out.println("Enter your Binary number");
				binary = scanner.nextLong();
				
			} catch (Exception e) {
				
				System.out.println("\nToo big of a number.\n");
				
			}
			
			
			while (binary > 0) {
				
				int digit = (int) (binary%10);
				
				if (digit == 0) {
					base *= 2;
				}
				else if (digit == 1) {
					decimal += base;
					base *= 2;
				}
				else {
					System.out.println("Invalid binary number.");
					return 0;
				}
				
				binary /= 10;
				
			}
			
			System.out.println("Conversion to decimal is: " + decimal);
			return decimal;
		}
		static int reverseNumber(int number){
			
			int decimal = 0, origNumber = number;
			
			while(origNumber > 0) {
				
				decimal *= 10;
				decimal += (origNumber%10);
				origNumber /= 10;
			}
			
			return decimal;
			
		}
		static void decimalToDigital(int decimal){
			
			int number = reverseNumber(decimal);
			String decimalNumber = String.valueOf(number), origNumber = String.valueOf(decimal);
			int numLength = decimalNumber.length(), origLength = origNumber.length();
			
			if (numLength != origLength) {
				
				numLength++;
				
			}
			
			String[][] digitalNumbers = {{" - ","   "," - "," - ","   "," - "," - "," - "," - "," - "},
										 {"| |","  |","  |","  |","| |","|  ","|  ","  |","| |","| |"},
										 {"   ","   "," - "," - "," - "," - "," - ","   "," - "," - "},
										 {"| |","  |","|  ","  |","  |","  |","| |","  |","| |","  |"},
										 {" - ","   "," - "," - ","   "," - "," - ","   "," - "," - "}};
			
			for (int i = 0; i < 5; i++) {
				
				int temp = number;

				for (int j = 0; j < numLength; j++) {
					
					int lastDigit = temp%10;
					System.out.print(digitalNumbers[i][lastDigit] + "  ");
					temp /= 10;

					
				}
				System.out.println();
				
			}
			
		}
		
		public static void main(String[] args) {
			
			decimalToDigital(binaryToDecimal());

		}
	}
