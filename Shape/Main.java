//Shhreyash Pandey
//22070126105
//AIML-B2

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateCircle();
                    break;
                case 2:
                    calculateRectangle();
                    break;
                case 3:
                    calculateSquare();
                    break;
                case 4:
                    calculateSphere();
                    break;
                case 5:
                    calculateCylinder();
                    break;
                case 6:
                    calculatePyramid();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    public static void calculateCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        circle.showShape("Circle");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }

    public static void calculateRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.showShape("Rectangle");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }

    public static void calculateSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);
        square.showShape("Square");
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());
    }

    public static void calculateSphere() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        Sphere sphere = new Sphere(radius);
        sphere.showShape("Sphere");
        System.out.println("Surface Area: " + sphere.calculateArea());
        System.out.println("Volume: " + sphere.calculateVolume());
    }

    public static void calculateCylinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        cylinder.showShape("Cylinder");
        System.out.println("Surface Area: " + cylinder.calculateArea());
        System.out.println("Volume: " + cylinder.calculateVolume());
    }

    public static void calculatePyramid() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the base of the pyramid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the base of the pyramid: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the pyramid: ");
        double height = scanner.nextDouble();
        Pyramid pyramid = new Pyramid(length, width, height);
        pyramid.showShape("Pyramid");
        System.out.println("Surface Area: " + pyramid.calculateArea());
        System.out.println("Volume: " + pyramid.calculateVolume());
    }
}

