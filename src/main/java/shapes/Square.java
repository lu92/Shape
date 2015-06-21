package shapes;

public class Square extends Shape {
    private int base;

    @Override
    public double getArea() {
        return base*base;
    }

    public Square() {

    }

    public Square(String name, Color color, int base) {
        super(name, color);
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }


    @Override
    public String toString() {
        return "shapes.Square{" +
                "base=" + base +
                "} " + super.toString();
    }
}
