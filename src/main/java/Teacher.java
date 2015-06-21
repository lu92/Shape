
import shapes.Color;
import shapes.Shape;
import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;

    private List<Shape> shapes = new ArrayList<Shape>();

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, List<Shape> shapes) {
        this.name = name;
        this.shapes = shapes;
    }

    public List<Shape> findShapesByAreaAndColor(double minArea, double maxArea, Color color) {
        List<Shape> result = new ArrayList<Shape>();
        for (Shape shape : getShapes())
            if (minArea <= shape.getArea() && shape.getArea() <= maxArea && shape.getColor() == color)
                result.add(shape);
        return result;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", name='" + name + '\'' +
                ", shapes=\n" + shapes +
                '}';
    }
}
