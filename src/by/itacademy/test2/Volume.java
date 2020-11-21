package by.itacademy.test2;

public abstract class Volume {
    private final double HEIGHT = 3L;
    private final double COEFFICIENT = 0.95;


    protected double a, b, h;
    protected double volume;


    protected Volume(double a) {
        this.a = a;
    }

    protected Volume(double a, double b) {
        this.a = a;
        this.b = b;
    }

    protected Volume(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    protected double square() {
        return a * a;
    }

    protected double rectangle() {
        return a * b * HEIGHT;
    }

    protected double isoscelesTrapezoid() {
        return (a + b) * h / 2 * HEIGHT;
    }

    protected double regularHexagon() {
        return a * a * Math.sqrt(27) / 2 * HEIGHT;
    }

    protected double circle() {
        return Math.PI * a * a * HEIGHT;
    }

    protected double oval() {
        return Math.PI * a * b * HEIGHT;
    }
}
