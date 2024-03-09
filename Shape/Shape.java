import java.util.*;
abstract class Shape {
    // Non-abstract method to display the shape
    public void showShape(String shape) {
        System.out.println("Selected Shape: " + shape);
    }

    // Abstract methods to calculate area and perimeter
    abstract double calculateArea();
    abstract double calculatePerimeter();
}