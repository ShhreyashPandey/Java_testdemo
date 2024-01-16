import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Basic arithmetic operations
        double num1 = UserInput.getDoubleInput("Enter the first number: ");
        double num2 = UserInput.getDoubleInput("Enter the second number: ");

        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int ch = scanner.nextInt();

        double result;
        switch (ch) {
            case 1:
                result = Calculator.addition(num1, num2);
                break;
            case 2:
                result = Calculator.subtraction(num1, num2);
                break;
            case 3:
                result = Calculator.multiplication(num1, num2);
                break;
            case 4:
                result = Calculator.division(num1, num2);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);

        // Array operations
         int arraySize = (int) UserInput.getDoubleInput("Enter the size of the array: ");
        double[] array = UserInput.getArrayInput(arraySize);

        System.out.println("Array operations:");
        System.out.println("1. Sum of array");
        System.out.println("2. Variance of array");
        System.out.println("3. Standard Deviation of array");
        int arrayOperation = scanner.nextInt();

        double arrayResult;
        switch (arrayOperation) {
            case 1:
                arrayResult = Calculator.sumOfArray(array, arraySize);
                break;
            case 2:
                arrayResult = Calculator.varOfArray(array, arraySize);
                break;
            case 3:
                arrayResult = Calculator.stddevOfArray(array, arraySize);
                break;
            default:
                System.out.println("Invalid array operation");
                return;
        }

        System.out.println("Array Result: " + arrayResult);
    }
}