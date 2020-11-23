package by.itacademy.interfaces;

public interface Volume {
    double HEIGHT = 3L;
    double volume();

    default double volume(double[] baseSquare){
        if(baseSquare.length == 1) return baseSquare[0] * HEIGHT;
        else return (baseSquare[0] + Math.sqrt(baseSquare[0] * baseSquare[1]) + baseSquare[1]) * HEIGHT / 3;
    }
}
