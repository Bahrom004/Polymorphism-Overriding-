
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Trapezium trapezium = new Trapezium(3, 4, 5, 6, 7);
        Rectangle rectangle = new Rectangle(3, 4);

        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        System.out.println("Trapezium area: " + trapezium.area());
        System.out.println("Trapezium perimeter: " + trapezium.perimeter());

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
    }
}