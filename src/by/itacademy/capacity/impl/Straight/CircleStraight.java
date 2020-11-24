package by.itacademy.capacity.impl.Straight;

import by.itacademy.capacity.Capacity;
import by.itacademy.type.FluidType;
import java.util.Locale;

public class CircleStraight extends Capacity {
    private final double r;

    public CircleStraight(double r, FluidType fluidType) {
        super(fluidType);
        this.r = r;
    }

    @Override
    public double areaBase() {
        return circle(r);
    }

    @Override
    public double volume() {
        return volume(areaBase());
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " r  = %-8.2f",
                r);
    }
}

