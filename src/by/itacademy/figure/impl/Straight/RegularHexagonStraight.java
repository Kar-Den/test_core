package by.itacademy.figure.impl.Straight;

import by.itacademy.figure.Figure;
import by.itacademy.type.FluidType;

import java.util.Locale;

public class RegularHexagonStraight extends Figure {

    private final double a;

    public RegularHexagonStraight(double a, FluidType fluidType) {
        super(fluidType);
        this.a = a;
    }

    @Override
    public double areaBase() {
        return regularHexagon(a);
    }

    @Override
    public double volume() {
        return volume(areaBase());
    }

    @Override
    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                super.toString() + " a = %-8.2f",
                a);
    }
}

