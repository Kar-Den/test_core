package by.itacademy;

public enum Figure {
    SQUARE("квадрат") {
        public double area(double sideOfSquare) {
            return sideOfSquare * sideOfSquare;
        }
    },
    //    RECTANGLE (),
    ISOSCELES_TRAPEZOID("равнобедренная трапеция") {
        public double area(double baseA, double baseB, double trapezoidHeight) {
            return (baseA + baseB) * trapezoidHeight / 2;
        }
    };
    //    REGULAR_HEXAGON,
//    CIRCLE,
//    OVAL;
    private String figureNameRus;
    private double side;

    Figure(String figureNameRus) {
        this.figureNameRus = figureNameRus;
    }

    public String getFigureNameRus() {
        return figureNameRus;
    }

    public double area(double a) {
        return a * a;
    }

    public double area(double a, double b, double h) {
        return (a + b) * h / 2;
    }
}
