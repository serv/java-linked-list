package linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testInstantiation() {
        Node node = new Node(3.14);
        assertEquals(3.14, node.value, DELTA);
    }
    
    @Test
    public void testStringNodeValue() {
        Node node = new Node(10.2);
        assertEquals("failure - strings are not equal", "{ 10.2 }", node.stringNodeValue());
    }
    

}
