package by.itacademy.test3.figure;

import by.itacademy.test3.interfaces.Area;
import by.itacademy.test3.interfaces.Mass;
import by.itacademy.test3.interfaces.Volume;
import by.itacademy.test3.type.FluidType;

import java.util.Locale;

public abstract class Figure implements Area, Volume, Mass {
    protected FluidType fluidType;

    public Figure(FluidType fluidType) {
        this.fluidType = fluidType;
    }

    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                "%-25s жидкость: %-20s объём: %-10.2f масса: %-10.2f",
                this.getClass().getSimpleName(),fluidType.getType(), volume(), mass());
    }

}
