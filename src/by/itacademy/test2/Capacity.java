package by.itacademy.test2;

import by.itacademy.test3.type.FluidType;

public class Capacity extends Volume {
    private double a, b, h;
    protected FluidType fluidType;
    protected double fluidMass;


    protected Capacity(double a, double b) {
        super(a, b);
    }

    protected Capacity(double a, double b, double h) {
        super(a, b, h);
    }

    public double fillIn(FluidType fluidType){
        return fluidType.getDensity();
    }


}
