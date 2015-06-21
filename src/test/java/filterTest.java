import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import shapes.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucjan on 21.06.15.
 */
public class filterTest {

    private static Teacher teacher;

    @BeforeClass
    public static void prepareTeacher() {
        List<Shape> data = new ArrayList<Shape>();
        data.add(new Rectangle("Rectangle1", Color.RED, 9, 5));
        data.add(new Square("Square1", Color.BLUE, 3));
        data.add(new Triangle("Triangle1", Color.RED, 10, 3));
        data.add(new Rectangle("Rectangle2", Color.GREEN, 8, 3));
        data.add(new Triangle("Triangle2", Color.YELLOW, 10, 13));
        data.add(new Square("Square2", Color.RED, 13));
        data.add(new Square("Square3", Color.BLUE, 7));
        data.add(new Circle("Circle1", Color.RED, 10));
        data.add(new Rectangle("Rectangle4", Color.GREEN, 10, 3));
        data.add(new Circle("Circle2", Color.RED, 4));
        teacher = new Teacher("teacher", data);
    }

    @Test
    public void doFilter() {
//        for (Shape shape : teacher.findShapesByAreaAndColor(10, 50, Color.RED))
//            System.out.println(shape);
        Assert.assertEquals(3,teacher.findShapesByAreaAndColor(10, 70, Color.RED).size());
    }
}
