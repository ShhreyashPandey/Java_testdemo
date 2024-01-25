//Shhreyash Pandey 22070126105 AIML_B2
import java.io.*;
import java.util.*;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Input input = new Input();
		// Buffered array : to get string of numbers, an array of numbers
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// scanner: size of array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		
		int index_even = 0;
		int index_odd = 0;
		int count = 0;
		
		// index_even, index_odd : dynamic array
		double[] even = new double[size];
		double[] odd = new double[size];
		double[] inputArray = input.arr(size);
		
		// initialize array
		for (int j = 0; j < size; j++) {
			if (inputArray[j] % 2 == 0) {
				even[index_even] = inputArray[j];
				index_even++;
			} else {
				odd[index_odd] = inputArray[j];
				index_odd++;
			}
		}
		
		System.out.println("Even numbers are:");
		for (int k = 0; k < index_even; k++) {
			System.out.println(" " + even[k]);
		}
		
		System.out.println("Odd numbers are:");
		for (int m = 0; m < index_odd; m++) {
			System.out.println(" " + odd[m]);
		}
	}
}