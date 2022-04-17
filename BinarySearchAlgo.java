import java.util.Scanner;

public class BinarySearchAlgo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arrOfNumbers = {1,21,412,4,215,235,5,3221,1,43,235,234,12,342,4,3,523,4,123,235123};
		
		bubbleSort(arrOfNumbers);
		
		int start = 0, end = arrOfNumbers.length - 1, mid = (start+end)/2;
		System.out.println("What key are you looking for?");
		int key = scanner.nextInt();
		boolean keyFound = false;
		
		while (start <= end) {
			
			mid = (start+end)/2;
			
			if (arrOfNumbers[mid] == key) {
				
				System.out.println("The key has been found!");
				keyFound = true; 
				break;
			}
			else if (arrOfNumbers[mid] > key) {
				
				end = mid-1;
				
			}
			else if (arrOfNumbers[mid] < key) {
				
				start = mid+1;
				
			}
		}

		if (keyFound == false) {
			System.out.println("The key was not found.");
		}
	}
	
	static void bubbleSort(int arr[]) {
		
		int n = arr.length-1;
		int temp = 0;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n - i; j++) {
				
				if (arr[j] > arr[j+1]) {
					
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

}
