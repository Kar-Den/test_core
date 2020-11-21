package by.itacademy;

public class CapacityInclined extends CapacityStraight {

    private Figure figurePeak;
    private double areaFigurePeak;
    private double volume;

    public CapacityInclined(Figure figureBase, double areaFigureBase, double areaFigurePeak) {
        super(figureBase, areaFigureBase);
        double sumArea = areaFigureBase + areaFigurePeak;
        double sq =Math.sqrt(areaFigureBase*areaFigurePeak);
        volume = (sumArea + sq)*getHEIGHT()/3;
    }

    @Override
    public String toString() {
        return "Ёмкость наклонная{" +
                "объём=" + volume +
                ", масса жидкости=" + getFluidMass() +
                ", тип залитой жидкости: " + getFluidType() +
                ", фигура в основании: " + getFigureBase().getFigureNameRus() +
                '}';
    }


}
