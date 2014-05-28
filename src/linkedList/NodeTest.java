package linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testInstantiation() {
        Node<Integer> node = new Node<>(3);
        assertEquals(3, node.value, DELTA);
    }
    
    @Test
    public void testStringNodeValue() {
        Node<Integer> node = new Node<>(10);
        assertEquals("failure - strings are not equal", "{ 10 }", node.stringNodeValue());
    }
    
    @Test
    public void testPrimitives() {
        Node<Integer> intNode = new Node<>(100);
        Node<Double> doubleNode = new Node<>(100.0);
        Node<String> stringNode = new Node<>("One hundred");
        
        assertEquals(100, intNode.value, DELTA);
        assertEquals(100.0, doubleNode.value, DELTA);
        assertEquals("failure - strings are not equal", "One hundred", stringNode.value);
    }

}
