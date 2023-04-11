package ss7_abstract.bai_tap.resizeable;
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("Area circle before: " + circle.getArea());
        System.out.println("After: ");
        circle.resize(5);
        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println("Area rectangle before: " + rectangle.getArea());
        System.out.println("After: ");
        rectangle.resize(5);
        Square square = new Square(5);
        System.out.println("Area square before: " + square.getArea());
        System.out.println("After: ");
        square.resize(5);
    }
}
