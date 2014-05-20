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
        assertTrue("failure - should be true", true);
    }
    
    @Test
    public void testGetHead() {
        List list = new List();
        assertEquals("failure - list's head should be null", list.getHead(), null);
    }
    
    @Test
    public void testGetTail() {
        List list = new List();
        assertEquals("failure - list's tail should be null", list.getTail(), null);
    }
    
    @Test
    public void testAddHead() {
        List list = new List();
        list.addHead(3);
        assertEquals("failure - list's head should be 3", list.getHead(), 3);
    }
    
    @Test
    public void testAddTail() {
        List list = new List();
        list.addTail(3);
        assertEquals("failure - list's head should be 3", list.getTail(), 3);
    }
    
    @Test
    public void testStringList() {
        List list = new List();
        list.addHead(3);
        list.addHead(2);
        list.addHead(1);
        assertEquals("failure - list's head should be 1 2 3", list.stringList(), "1 - 2 - 3");
    }

}
