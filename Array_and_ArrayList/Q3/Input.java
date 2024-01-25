import java.util.Scanner;
public class Input {
	// Function to get user input for an array of integers
	public int[] getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter the elements of the array:");
		
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}
}