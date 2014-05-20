package linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListTest {

    @Test
    public void testInstantiation() {
        List list = new List();
        assertEquals("failure - list count is not 0", list.getCount(), 0);
    }
    
    @Test
    public void testIsEmpty() {
        List list = new List();
        assertEquals("failure - should be true", true, list.isEmpty());
    }
    
    @Test
    public void testGetHead() {
        List list = new List();
        assertEquals("failure - list's head should be null", null, list.getHead());
    }
    
    @Test
    public void testGetTail() {
        List list = new List();
        assertEquals("failure - list's tail should be null", null, list.getTail());
    }
    
    @Test
    public void testAddHead() {
        List list = new List();
        list.addHead(3);
        assertEquals("failure - list count is not 1", list.getCount(), 1);
        assertEquals("failure - list's head should be 3", 3, list.getHead().value);
    }
    
    @Test
    public void testAddTail() {
        List list = new List();
        list.addTail(3);
        assertEquals("failure - list's head should be 3", 3, list.getTail().value);
    }
    
    @Test
    public void testStringList() {
        List list = new List();
        list.addHead(3);
        list.addHead(2);
        list.addHead(1);
        assertEquals("failure - list's head should be 1 2 3 ", "1 2 3 ", list.stringList());
    }

}
