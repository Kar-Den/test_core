package by.itacademy;

import by.itacademy.comparator.FigureComparator;
import by.itacademy.figure.Figure;
import by.itacademy.figure.impl.RectangleStraight;
import by.itacademy.figure.impl.SquareInclined;
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

        Figure squareInclined = new SquareInclined(2L, 3L, FluidType.PETROL);
        figureList.add(squareInclined);

        Figure rectangleStraight = new RectangleStraight(2L, 3L, FluidType.KEROSENE);
        figureList.add(rectangleStraight);



        figureList.sort(new FigureComparator());
        figureList.forEach(System.out::println);
    }
}
