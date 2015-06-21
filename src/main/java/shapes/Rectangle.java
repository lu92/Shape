package shapes;

public class Rectangle extends Shape {
    private int base;
    private int height;

    @Override
    public double getArea() {
        return base*height;
    }

    public Rectangle() {

    }

    public Rectangle(String name, Color color, int base, int height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "shapes.Rectangle{" +
                "base=" + base +
                ", height=" + height +
                "} " + super.toString();
    }
}
