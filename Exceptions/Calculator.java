import java.util.*;

public class Calculator{
    private Scanner scanner = new Scanner(System.in);

    public void addition() {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = num1 + num2;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
            scanner.next(); // consume invalid input
        }
    }

    public void subtraction() {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = num1 - num2;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
            scanner.next(); // consume invalid input
        }
    }

    public void multiplication() {
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = num1 * num2;

            // Check if the result exceeds a certain threshold
            if (result > 100) {
                throw new CustomException("Result exceeds the threshold");
            }

            System.out.println("Result: " + result);
        } catch (Exception e) {
            handleException(e);
        }
    }


    public void division() {
        try {
            System.out.print("Enter numerator: ");
            double numerator = scanner.nextDouble();
            System.out.print("Enter denominator: ");
            double denominator = scanner.nextDouble();

            if (denominator == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }

            double result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            handleException(e);
        }
    }

    private void handleException(Exception e) {
        if (e instanceof CustomException) {
            System.out.println("Custom Exception: " + e.getMessage());
        } else if (e instanceof ArithmeticException) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } else {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
