/**
 * Created by AngelaValdez on 8/24/2016.
 */
public class Main {
    public static void main(String[] args) {
        Square square = new Square(2);
        System.out.println("Square area:" + square.calculateArea());
        System.out.println("Square perimeter:" + square.calculatePerimeter());

        Rectangle rectangle = new Rectangle(2,5);
        System.out.println("Rectangle area:" + rectangle.calculateArea());
        System.out.println("Rectangle perimeter:" + rectangle.calculatePerimeter());

        Circle circle = new Circle(2);
        System.out.println("Circle area:" + circle.calculateArea());
        System.out.println("Circle perimeter:" + circle.calculatePerimeter());

    }
}
