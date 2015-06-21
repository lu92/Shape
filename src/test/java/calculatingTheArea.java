import org.junit.Assert;
import org.junit.Test;
import shapes.*;

/**
 * Created by lucjan on 21.06.15.
 */
public class calculatingTheArea {

    @Test
    public void calculateRectangleArea() {
        Rectangle rectangle = new Rectangle("rec1", Color.RED, 3, 4);
        Assert.assertEquals(12,rectangle.getArea(), 0.01);
    }

    @Test
    public void calculateSquareArea() {
        Square square = new Square("rec1", Color.RED, 3);
        Assert.assertEquals(9,square.getArea(), 0.01);
    }


    @Test
    public void calculateTriangleArea() {
        Triangle triangle = new Triangle("rec1", Color.RED, 3, 4);
        Assert.assertEquals(6,triangle.getArea(), 0.01);
    }

    @Test
    public void calculateCircleArea() {
        Circle circle = new Circle("rec1", Color.RED, 1);
        Assert.assertEquals(3.14, circle.getArea(), 0.01);
    }

}
