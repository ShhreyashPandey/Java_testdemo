import java.util.*;
public class Sphere extends Shape implements Volume {
    double radius;

    Sphere(double r) {
        radius = r;
    }

    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        // Perimeter is not applicable for a sphere
        return -1;
    }

    @Override
    public double calculateVolume() {
        return (4.0/3) * Math.PI * Math.pow(radius, 3);
    }
}