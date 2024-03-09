import java.util.*;
public class Pyramid extends Shape implements Volume {
    double baseLength, baseWidth, height;

    Pyramid(double l, double w, double h) {
        baseLength = l;
        baseWidth = w;
        height = h;
    }

    @Override
    double calculateArea() {
        return baseLength * baseWidth + baseLength * Math.sqrt(Math.pow(baseWidth / 2, 2) + height * height) + baseWidth * Math.sqrt(Math.pow(baseLength / 2, 2) + height * height);
    }

    @Override
    double calculatePerimeter() {
        // Perimeter is not applicable for a pyramid
        return -1;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3) * baseLength * baseWidth * height;
    }
}