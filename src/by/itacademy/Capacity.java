package by.itacademy;

public class Capacity {

    Enum<CapacityType> capacityTypeEnum;
    Enum<CapacityBase> capacityBaseEnum;
    final int HEIGHT = 2; //высота в метрах
    double volume;
    double a, b, h, r;

    public Capacity(Enum<CapacityType> capacityTypeEnum, Enum<CapacityBase> capacityBaseEnum) {
        this.capacityTypeEnum = capacityTypeEnum;
        this.capacityBaseEnum = capacityBaseEnum;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double volume() {
        if (capacityTypeEnum.equals(CapacityType.STRAIGHT)) {
            if (capacityBaseEnum.equals(CapacityBase.SQUARE)) {
                volume = a * a * HEIGHT;
                return volume;
            } else if (capacityBaseEnum.equals(CapacityBase.RECTANGLE)) {
                volume = a * b * HEIGHT;
                return volume;
            } else if (capacityBaseEnum.equals(CapacityBase.ISOSCELES_TRAPEZOID)){
                double squareIsoscelesTrapezoid = (a+b)*h/2;
                volume = squareIsoscelesTrapezoid*HEIGHT;
                return volume;
            } else if (capacityBaseEnum.equals(CapacityBase.REGULAR_HEXAGON)){
                double squareRegularHexagon = a*a*Math.sqrt(27)/2;
                volume = squareRegularHexagon*HEIGHT;
                return volume;
            } else if (capacityBaseEnum.equals(CapacityBase.CIRCLE)){
                double squareCircle = Math.PI*r*r;
                volume = squareCircle*HEIGHT;
                return volume;
            }

        } else System.out.println("не известная штука");
        return volume;
    }
}
