package by.itacademy;

import by.itacademy.comparator.FigureComparator;
import by.itacademy.figure.Figure;
import by.itacademy.figure.impl.Inclinde.IsoscelesTrapezoidInclinde;
import by.itacademy.figure.impl.Straight.IsoscelesTrapezoidStraight;
import by.itacademy.figure.impl.Straight.RectangleStraight;
import by.itacademy.figure.impl.Inclinde.SquareInclined;
import by.itacademy.type.FluidType;
import by.itacademy.figure.impl.Straight.SquareStraight;

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

        Figure isoscelesTrapezoidStraight = new IsoscelesTrapezoidStraight(2L, 3L, 2L, FluidType.MACHINE_OIL);
        figureList.add(isoscelesTrapezoidStraight);

        Figure isoscelesTrapezoidInclinde = new IsoscelesTrapezoidInclinde(2L, 3L, 2L, 3L, 4L, 2L, FluidType.MACHINE_OIL);
        figureList.add(isoscelesTrapezoidInclinde);




        figureList.sort(new FigureComparator());
        figureList.forEach(System.out::println);
    }
}
