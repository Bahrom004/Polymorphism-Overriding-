public class Trapezium extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double high;

    public Trapezium(double sideA, double sideB, double sideC, double sideD, double high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.high = high;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double area(){
        return (sideA+sideB)*high/2;
    }

    public double perimeter(){
        return sideA+sideB+sideC+sideD;
    }


}
