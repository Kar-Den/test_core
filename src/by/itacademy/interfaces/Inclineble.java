package by.itacademy.interfaces;

public interface Inclineble extends Volume {
    double areaTop();

    default double volume(double baseSquare1, double baseSquare2) {
        return (baseSquare1 + Math.sqrt(baseSquare1 * baseSquare2) + baseSquare2) * HEIGHT / 3;
    }
}
