package by.itacademy;

public enum FluidType {
    PETROL (740, "бензин"),
    KEROSENE (820, "керосин"),
    MACHINE_OIL (910, "машинное масло");

    int density;
    String type;

    FluidType(int density, String type) {
        this.density = density;
        this.type = type;
    }

    public int getDensity() {
        return density;
    }

    public String getType() {
        return type;
    }
}
