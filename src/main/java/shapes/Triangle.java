package shapes;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle() {
    }

    public Triangle(String name, Color color, int base, int height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Double.valueOf((base * height)/2);
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
        return "shapes.Triangle{" +
                "base=" + base +
                ", height=" + height +
                "} " + super.toString();
    }
}
