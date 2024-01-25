// shhreyash pandey 22070126105 AIML_B2
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Get user input
		Input input = new Input();
		int[] array = input.getUserInput();
		
		// Convert array to ArrayList
		ArrayList<Integer> arrayList = convertArrayToArrayList(array);
		System.out.println("Array converted to ArrayList: " + arrayList);
		
		// Convert ArrayList to array
		int[] newArray = convertArrayListToArray(arrayList);
		System.out.println("ArrayList converted to array: " + Arrays.toString(newArray));
	}
	
	// Function to convert an array to ArrayList
	public static ArrayList<Integer> convertArrayToArrayList(int[] array) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int value : array) {
			arrayList.add(value);
		}
		return arrayList;
	}
	
	// Function to convert ArrayList to array
	public static int[] convertArrayListToArray(ArrayList<Integer> arrayList) {
		int[] array = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			array[i] = arrayList.get(i);
		}
		return array;
	}
}