package by.itacademy.interfaces;

public interface Area {

    double area();

    default double square(double a) {
        return a * a;
    }

    default double rectangle(double a, double b) {
        return a * b;
    }

    default double isoscelesTrapezoid(double a, double b, double h) {
        return (a + b) * h / 2;
    }

    default double regularHexagon(double a) {
        return a * a * Math.sqrt(27) / 2;
    }

    default double circle(double r) {
        return Math.PI * r * r;
    }

    default double oval(double a, double b) {
        return Math.PI * a * b;
    }
}
