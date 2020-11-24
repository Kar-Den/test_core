package by.itacademy.figure.impl.Inclined;

import by.itacademy.figure.Figure;
import by.itacademy.interfaces.Inclineble;
import by.itacademy.type.FluidType;

import java.util.Locale;

public class RegularHexagonInclined extends Figure implements Inclineble {
    private final double a1, a2;

    public RegularHexagonInclined(double a1, double a2, FluidType fluidType) {
        super(fluidType);
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public double areaBase() {
        return regularHexagon(a1);
    }

    public double areaTop() {
        return regularHexagon(a2);
    }

    @Override
    public double volume() {
        return volume(areaBase(), areaTop());
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " a1 = %-8.2f a2 = %.2f",
                a1, a2);
    }
}
