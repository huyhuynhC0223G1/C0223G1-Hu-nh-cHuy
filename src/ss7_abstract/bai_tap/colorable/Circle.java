package ss7_abstract.bai_tap.colorable;
public class Circle extends Shape implements IColorable {
    private double radius = 1.0;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * 3.14;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "area circle= " + getArea();
    }
    @Override
    public void howToColor() {
//        System.out.println("momkmm");
    }
}
