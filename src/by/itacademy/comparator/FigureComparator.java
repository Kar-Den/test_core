package by.itacademy.comparator;

import by.itacademy.figure.Capacity;

import java.util.Comparator;

public class FigureComparator implements Comparator<Capacity> {
    @Override
    public int compare(Capacity o1, Capacity o2) {
        return Double.compare(o1.mass(), o2.mass());
    }
}
