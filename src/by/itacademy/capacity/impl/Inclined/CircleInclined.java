package by.itacademy.capacity.impl.Inclined;

import by.itacademy.capacity.Capacity;
import by.itacademy.interfaces.Inclineble;
import by.itacademy.type.FluidType;

import java.util.Locale;

public class CircleInclined extends Capacity implements Inclineble {
    private final double r1, r2;

    public CircleInclined(double r1, double r2, FluidType fluidType) {
        super(fluidType);
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public double areaBase() {
        return circle(r1);
    }

    public double areaTop() {
        return circle(r2);
    }

    @Override
    public double volume() {
        return volume(areaBase(), areaTop());
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " r1 = %-8.2f r2 = %.2f",
                r1, r2);
    }
}
