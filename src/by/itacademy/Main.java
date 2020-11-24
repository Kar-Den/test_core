package by.itacademy;

import by.itacademy.comparator.CapacityComparator;
import by.itacademy.capacity.Capacity;
import by.itacademy.capacity.impl.Inclined.CircleInclined;
import by.itacademy.capacity.impl.Inclined.IsoscelesTrapezoidInclined;
import by.itacademy.capacity.impl.Inclined.RegularHexagonInclined;
import by.itacademy.capacity.impl.Straight.*;
import by.itacademy.capacity.impl.Inclined.SquareInclined;
import by.itacademy.type.FluidType;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Capacity> capacityList = new ArrayList<>();

        Capacity squareStraight = new SquareStraight(2L, FluidType.MACHINE_OIL);
        capacityList.add(squareStraight);

        Capacity squareStraight1 = new SquareStraight(3L, FluidType.MACHINE_OIL);
        capacityList.add(squareStraight1);

        Capacity squareStraight2 = new SquareStraight(3L, FluidType.MACHINE_OIL);
        capacityList.add(squareStraight2);

        Capacity squareInclined = new SquareInclined(2L, 3L, FluidType.PETROL);
        capacityList.add(squareInclined);

        Capacity rectangleStraight = new RectangleStraight(2L, 3L, FluidType.KEROSENE);
        capacityList.add(rectangleStraight);

        Capacity isoscelesTrapezoidStraight = new IsoscelesTrapezoidStraight(2L, 3L, 2L, FluidType.MACHINE_OIL);
        capacityList.add(isoscelesTrapezoidStraight);

        Capacity isoscelesTrapezoidInclined = new IsoscelesTrapezoidInclined(2L, 3L, 2L, 3L, 4L, 2L, FluidType.MACHINE_OIL);
        capacityList.add(isoscelesTrapezoidInclined);

        Capacity regularHexagonStraight = new RegularHexagonStraight(2L, FluidType.PETROL);
        capacityList.add(regularHexagonStraight);

        Capacity regularHexagonInclined = new RegularHexagonInclined(2L, 3L, FluidType.KEROSENE);
        capacityList.add(regularHexagonInclined);

        Capacity circleStraight = new CircleStraight(2L, FluidType.MACHINE_OIL);
        capacityList.add(circleStraight);

        Capacity circleInclined = new CircleInclined(2L, 3L, FluidType.PETROL);
        capacityList.add(circleInclined);


        CapacityComparator capacityComparator = new CapacityComparator();
        capacityList.sort(capacityComparator);
        capacityList.forEach(System.out::println);

        System.out.println();
        System.out.println("наибольшая масса керосина:");

        capacityList.stream()
                .filter(Capacity::isKerosene)
                .max(capacityComparator)
                .ifPresent(capacity -> System.out.println(capacity.mass()));
    }
}
