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

    }

}
