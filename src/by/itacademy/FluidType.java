package by.itacademy;

public enum FluidType {
    PETROL (740),
    KEROSENE (820),
    MACHINE_OIL (910);

    private int density;

    FluidType(int density) {
        this.density = density;
    }

    public int getDensity() {
        return density;
    }
}
