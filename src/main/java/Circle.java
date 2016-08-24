/**
 * Created by AngelaValdez on 8/24/2016.
 */
public class Circle implements Shape {
    private double radio;

    public Circle (double radio){
        this.radio = radio;
    }
    public double calculateArea() {
        return Math.PI*radio+radio;
    }

    public double calculatePerimeter() {
        return 2*Math.PI*radio;
    }
}
