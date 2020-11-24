package by.itacademy.interfaces;

public interface Volume {
    double HEIGHT = 3L;
    double volume();

    default double volume(double baseSquare){
        return baseSquare * HEIGHT;
    }
}
