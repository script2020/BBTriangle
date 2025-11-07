package triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void testIfTriangleIsEquilateral() {
        Triangle triangle = new Triangle(3, 3, 3);
        assertEquals("equilateral", triangle.classify());
    }
    
    @Test
    public void testIfTriangleIsIsosceles() {
        Triangle triangle = new Triangle(3, 3, 4);
        assertEquals("isossceles", triangle.classify());
    }
    
    @Test
    public void testIfTriangleIsScalene() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals("scalene", triangle.classify());
    }
    
    @Test
    public void testIfTriangleIsRightAngled() {
        Triangle triangle = new Triangle(5, 4, 3);
        assertEquals("right-angled", triangle.classify());
    }

    @Test
    public void testIfTriangleIsImpossible() {
        Triangle triangle = new Triangle(-1, 100, 10);
        assertEquals("impossible", triangle.classify());
    }
}
