package by.itacademy;

import by.itacademy.test3.type.FluidType;

public class Main {

    public static void main(String[] args) {


        CapacityStraight capacityStraightSquareBase = new CapacityStraight(Figure.SQUARE,
                Figure.SQUARE.area(2.0));
        capacityStraightSquareBase.fillIn(FluidType.KEROSENE);
        System.out.println(capacityStraightSquareBase.toString());

        CapacityStraight capacityStraightISOSCELES_TRAPEZOID = new
                CapacityStraight(Figure.ISOSCELES_TRAPEZOID, Figure.ISOSCELES_TRAPEZOID.area(2.0, 3.0, 2.0));
        capacityStraightISOSCELES_TRAPEZOID.fillIn(FluidType.PETROL);
        System.out.println(capacityStraightISOSCELES_TRAPEZOID.toString());


        CapacityInclined capacityInclinedSquare = new CapacityInclined(Figure.SQUARE,
                Figure.SQUARE.area(2.0),
                Figure.SQUARE.area(3.0));
        capacityInclinedSquare.fillIn(FluidType.MACHINE_OIL);
        System.out.println(capacityInclinedSquare.toString());


    }

}
