
public class bubbleSortPractice {

	public static void main(String[] args) {
		
		int[] arrOfNumbers = {1,2,3,4,124,64,457,23,543,765,97643,234,12,567,879,43,21};
		
		printArray(arrOfNumbers);
		bubbleSort(arrOfNumbers);
		System.out.println();
		printArray(arrOfNumbers);
		

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

	static void printArray(int arr[]) {
		
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
			if (i != n-1) {
				System.out.print(" , ");
			}
		}
		
	}
}
