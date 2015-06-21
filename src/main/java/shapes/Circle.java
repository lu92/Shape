package shapes;

public class Circle extends Shape {

    private int R;

    public Circle() {
    }

    public Circle(String name, Color color, int r) {
        super(name, color);
        R = r;
    }

    @Override
    public double getArea() {
        return 3.14 * R * R;
    }

    @Override
    public String toString() {
        return "shapes.Circle{" +
                "R=" + R +
                "} " + super.toString();
    }
}
