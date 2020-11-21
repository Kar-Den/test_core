package by.itacademy.test3.comparator;

import by.itacademy.test3.figure.Figure;

import java.util.Comparator;

public class FigureComparator implements Comparator<Figure> {
    @Override
    public int compare(Figure o1, Figure o2) {
        return Double.compare(o1.mass(), o2.mass());
    }
}
