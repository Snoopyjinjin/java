import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {

	@Test
    public void testIsTriangle1(){
        Triangle t = new Triangle(1,1,1);
        assertTrue(t.isTriangle(t));
    }



	@Test
    public void testIsTriangle2(){
       
        Triangle t = new Triangle(3,4,5);
        assertTrue(t.isTriangle(t));
    }

    @Test
    public void testIsTriangle3(){
        Triangle t = new Triangle(4,5,6);
        assertTrue(t.isTriangle(t));
    }
    @Test
    public void testIsTriangle4(){
        Triangle t = new Triangle(8,8,6);
        assertTrue(t.isTriangle(t));
    }

    @Test
    public void testIsTriangle5(){
        
        Triangle t = new Triangle(0,1,2);
        assertTrue(t.isTriangle(t));
}
}
