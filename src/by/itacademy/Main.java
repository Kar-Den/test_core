package by.itacademy;

import by.itacademy.comparator.FigureComparator;
import by.itacademy.figure.Figure;
import by.itacademy.type.FluidType;
import by.itacademy.figure.impl.SquareStraight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figureList = new ArrayList<>();

        Figure squareStraight = new SquareStraight(2L, FluidType.MACHINE_OIL);
        figureList.add(squareStraight);

        Figure squareStraight1 = new SquareStraight(3L, FluidType.MACHINE_OIL);
        figureList.add(squareStraight1);

        Figure squareStraight2 = new SquareStraight(3L, FluidType.MACHINE_OIL);
        figureList.add(squareStraight2);




        figureList.sort(new FigureComparator());
        figureList.forEach(System.out::println);
    }
}
