import java.util.*;
public class Cylinder extends Shape implements Volume {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double calculatePerimeter() {
        // Perimeter is not applicable for a cylinder
        return -1;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}