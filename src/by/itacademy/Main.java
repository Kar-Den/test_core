package by.itacademy;

public class Main {

    public static void main(String[] args) {
        Capacity capacity = new Capacity(CapacityType.STRAIGHT, CapacityBase.SQUARE);
        capacity.a = 2.0;
        double volume = capacity.volume();
        System.out.println(volume);

        Capacity capacityRectangle = new Capacity(CapacityType.STRAIGHT, CapacityBase.RECTANGLE);
        capacityRectangle.setA(2);
        capacityRectangle.setB(3);
        double volumeRectangle = capacityRectangle.volume();
        System.out.println(volumeRectangle);

        Capacity capacityIsoscelesTrapezoid = new Capacity(CapacityType.STRAIGHT, CapacityBase.ISOSCELES_TRAPEZOID);
        capacityIsoscelesTrapezoid.setA(2);
        capacityIsoscelesTrapezoid.setB(3);
        capacityIsoscelesTrapezoid.setH(2);
        double volumeIsoscelesTrapezoid = capacityIsoscelesTrapezoid.volume();
        System.out.println(volumeIsoscelesTrapezoid);

        Capacity capacityRegularHexagon = new Capacity(CapacityType.STRAIGHT, CapacityBase.REGULAR_HEXAGON);
        capacityRegularHexagon.setA(3);
        double volumeRegularHexagon = capacityRegularHexagon.volume();
        System.out.println(volumeRegularHexagon);

        Capacity capacityCircle = new Capacity(CapacityType.STRAIGHT, CapacityBase.CIRCLE);
        capacityCircle.setR(5);
        double volumeCapacityCircle = capacityCircle.volume();
        System.out.println(volumeCapacityCircle);

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
