/**
 * Created by AngelaValdez on 8/24/2016.
 */
public class Rectangle implements Shape {
    private final double mayorSide;
    private final double minorSide;

    public Rectangle(double mayorSide, double minorSide) {
        this.mayorSide = mayorSide;
        this.minorSide = minorSide;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return mayorSide * minorSide;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return 2 * (mayorSide + minorSide);
    }
}
