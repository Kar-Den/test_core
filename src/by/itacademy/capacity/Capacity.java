package by.itacademy.capacity;

import by.itacademy.interfaces.Area;
import by.itacademy.interfaces.Mass;
import by.itacademy.interfaces.Volume;
import by.itacademy.type.FluidType;

import java.util.Locale;

public abstract class Capacity implements Area, Volume, Mass {
    protected FluidType fluidType;

    public Capacity(FluidType fluidType) {
        this.fluidType = fluidType;
    }

    @Override
    public double mass() {
        return mass(fluidType, volume());
    }

    public boolean isKerosene(){
        if (this.fluidType==FluidType.KEROSENE) return true;
        else return false;
    }

    public String toString() {
        return String.format(
                new Locale("ru-Ru"),
                "%-30s жидкость: %-16s объём: %-7.2f масса: %-10.2f",
                this.getClass().getSimpleName(),fluidType.getType(), volume(), mass());
    }

}
