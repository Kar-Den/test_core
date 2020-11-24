package by.itacademy.interfaces;

public interface Volume {
    double HEIGHT = 3L;
    double volume();

    default double volume(double baseSquare){
        return baseSquare * HEIGHT;
    }

//    default double volume(double baseSquare1, double baseSquare2){
//        return (baseSquare1 + Math.sqrt(baseSquare1 * baseSquare2) + baseSquare2) * HEIGHT / 3;
//    }
}
