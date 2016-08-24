/**
 * Created by AngelaValdez on 8/24/2016.
 */
public class Rectangle implements Shape {
    private double mayorSide;
    private double minorSide;

    public Rectangle (double mayorSide, double minorSide){
        this.mayorSide = mayorSide;
        this.minorSide = minorSide;
    }
    public double calculateArea() {
        return mayorSide*minorSide;
    }

    public double calculatePerimeter() {
        return 2*(mayorSide + minorSide);
    }
}
