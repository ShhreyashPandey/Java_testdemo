import java.util.*;
class UserInput {
    // Method to get a double input from the user
    public static double getDoubleInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextDouble();
    }

    // Method to get an array input from the user
    public static double[] getArrayInput(int size) {
        double[] array = new double[size];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume invalid input
            }
            array[i] = scanner.nextDouble();
        }

        return array;
    }
}