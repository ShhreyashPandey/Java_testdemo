import java.util.Scanner;
public class Input{
	// Function to get user input for an array of numbers
	public static int[] getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();
		
		int[] numbers = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}
		return numbers;
	}
	/*Function to find the index of the first number with the smallest distance
	between neighboring numbers.
	The index of the first number with the smallest distance. Returns -1 if the array has less than two elements.
	*/
	
	public static int findNearestNeighborIndex(int[] numbers) {
		if (numbers.length < 2) {
			System.out.println("Array should have at least two elements");
			return -1;
		}
		int minDistance = Integer.MAX_VALUE;
		int index = -1;
		
		for (int i = 0; i < numbers.length - 1; i++) {
			int distance = Math.abs(numbers[i] - numbers[i + 1]);
			
			if (distance < minDistance) {
				minDistance = distance;
				index = i;
			}
		}
		return index;
		
	}
}