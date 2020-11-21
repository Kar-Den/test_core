package by.itacademy;

public class CapacityStraight {

    private final int HEIGHT = 2; //высота в метрах
    private double volume;
    private double fluidMass;
    private String fluidType;
    private Figure figureBase;

    public CapacityStraight(Figure figureBase, double areaFigureBase) {
        this.figureBase = figureBase;
        volume = areaFigureBase*HEIGHT;

    }

    public double fillIn (FluidType fluidType){
        this.fluidType = fluidType.getType();
        fluidMass = this.volume*fluidType.getDensity()*0.95;
        return fluidMass;
    }

    public double getFluidMass() {
        return fluidMass;
    }

    public String getFluidType() {
        return fluidType;
    }

    public Figure getFigureBase() {
        return figureBase;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    @Override
    public String toString() {
        return "Ёмкость прямая{" +
                "объём=" + volume +
                ", масса жидкости=" + fluidMass +
                ", тип залитой жидкости: " + fluidType +
                ", фигура в основании: " + figureBase.getFigureNameRus() +
                '}';
    }

}
