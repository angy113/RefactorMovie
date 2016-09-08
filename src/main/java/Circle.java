
public class Circle implements Shape {
    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    /**
     * {@inheritDoc}
     */
    public double calculateArea() {
        return Math.PI * radio * radio;
    }

    /**
     * {@inheritDoc}
     */
    public double calculatePerimeter() {
        return 2 * Math.PI * radio;
    }
}
