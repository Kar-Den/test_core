package by.itacademy.type;

public enum FluidType {
    PETROL (740L, "бензин"),
    KEROSENE (820L, "керосин"),
    MACHINE_OIL (910L, "машинное масло");

    double density;
    String type;

    FluidType(double density, String type) {
        this.density = density;
        this.type = type;
    }

    public double getDensity() {
        return density;
    }

    public String getType() {
        return type;
    }
}
