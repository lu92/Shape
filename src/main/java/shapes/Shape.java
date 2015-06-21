package shapes;

public abstract class Shape {
    private String name;
    private Color color;



//    zadeklarowana metoda do liczenia powierzchni
//          we wszystkich klasach pochodnych
    public abstract double getArea();

    public Shape() {
    }

    public Shape(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "shapes.Shape{" +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                "}\n";
    }
}
