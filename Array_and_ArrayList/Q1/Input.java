import java.util.Scanner;

public class Input {
    public double[] arr(int size) {
        double[] array = new double[size];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        return array;
    }
}
