// Shhreyash Pandey 22070126105 AIML_B2
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		// Get user input
		Scanner scan = new Scanner(System.in);
		Input input = new Input();
		int[] numbers = input.getUserInput();
		
		// Find and print the index of the first number with the smallest distance
		int index = input.findNearestNeighborIndex(numbers);
		System.out.println("Index of the first number with the smallest distance: " +index);
	}
}