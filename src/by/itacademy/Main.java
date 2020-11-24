package by.itacademy;

import by.itacademy.comparator.FigureComparator;
import by.itacademy.figure.Capacity;
import by.itacademy.figure.impl.Inclined.CircleInclined;
import by.itacademy.figure.impl.Inclined.IsoscelesTrapezoidInclined;
import by.itacademy.figure.impl.Inclined.RegularHexagonInclined;
import by.itacademy.figure.impl.Straight.*;
import by.itacademy.figure.impl.Inclined.SquareInclined;
import by.itacademy.type.FluidType;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Capacity> figureList = new ArrayList<>();

        Capacity squareStraight = new SquareStraight(2L, FluidType.MACHINE_OIL);
        figureList.add(squareStraight);

        Capacity squareStraight1 = new SquareStraight(3L, FluidType.MACHINE_OIL);
        figureList.add(squareStraight1);

        Capacity squareStraight2 = new SquareStraight(3L, FluidType.MACHINE_OIL);
        figureList.add(squareStraight2);

        Capacity squareInclined = new SquareInclined(2L, 3L, FluidType.PETROL);
        figureList.add(squareInclined);

        Capacity rectangleStraight = new RectangleStraight(2L, 3L, FluidType.KEROSENE);
        figureList.add(rectangleStraight);

        Capacity isoscelesTrapezoidStraight = new IsoscelesTrapezoidStraight(2L, 3L, 2L, FluidType.MACHINE_OIL);
        figureList.add(isoscelesTrapezoidStraight);

        Capacity isoscelesTrapezoidInclined = new IsoscelesTrapezoidInclined(2L, 3L, 2L, 3L, 4L, 2L, FluidType.MACHINE_OIL);
        figureList.add(isoscelesTrapezoidInclined);

        Capacity regularHexagonStraight = new RegularHexagonStraight(2L, FluidType.PETROL);
        figureList.add(regularHexagonStraight);

        Capacity regularHexagonInclined = new RegularHexagonInclined(2L, 3L, FluidType.KEROSENE);
        figureList.add(regularHexagonInclined);

        Capacity circleStraight = new CircleStraight(2L, FluidType.MACHINE_OIL);
        figureList.add(circleStraight);

        Capacity circleInclined = new CircleInclined(2L, 3L, FluidType.PETROL);
        figureList.add(circleInclined);


        figureList.sort(new FigureComparator());
        figureList.forEach(System.out::println);

        System.out.println();
        System.out.println("наибольшая масса керосина:");
        double maxMassKerosene = 0;
        double massTemp;
        for (Capacity item : figureList){
            if (item.isKerosene()){
                massTemp=item.mass();
                if (massTemp>maxMassKerosene){
                    maxMassKerosene = massTemp;
                }
            }
        }
        System.out.println(maxMassKerosene);
    }
}
