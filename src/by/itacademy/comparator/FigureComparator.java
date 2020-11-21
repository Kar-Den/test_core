package by.itacademy.comparator;

import by.itacademy.figure.Figure;

import java.util.Comparator;

public class FigureComparator implements Comparator<Figure> {
    @Override
    public int compare(Figure o1, Figure o2) {
        return Double.compare(o1.mass(), o2.mass());
    }
}
