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
        assertEquals("failure - list's tail should be 3", 3, list.getTail().value);
        
        list.addHead(2);
        assertEquals("failure - list's head should be 2", 2, list.getHead().value);
        assertEquals("failure - list's tail should be 3", 3, list.getTail().value);
        assertEquals(list.getHead().nextNode.value, 3);
        
        list.addHead(1);
        assertEquals("failure - list count is not 3", list.getCount(), 3);
        assertEquals("failure - list's head should be 1", 1, list.getHead().value);
        assertEquals("failure - list's tail should be 3", 3, list.getTail().value);
    }
    
    @Test
    public void testAddTail() {
        List list = new List();
        list.addTail(3);
        assertEquals("failure - list count is not 1", list.getCount(), 1);
        assertEquals("failure - list's tail should be 3", 3, list.getTail().value);
        
        list.addTail(2);
        list.addTail(1);
        assertEquals("failure - list count is not 3", list.getCount(), 3);
        assertEquals("failure - list's tail should be 1", 1, list.getTail().value);
    }
    
    @Test
    public void testStringList() {
        List list = new List();
        list.addHead(4);
        assertEquals("4", list.stringList());
        
        list.addHead(3);
        assertEquals("3 4", list.stringList());
        
        list.addHead(2);
        list.addHead(1);
        assertEquals("1 2 3 4", list.stringList());
    }
    
    @Test
    public void testHasValue() {
        List list = new List();
        list.addHead(3);
        list.addHead(2);
        list.addHead(1);
        assertEquals("failure - should be true", true, list.hasValue(1));
        assertEquals("failure - should be true", true, list.hasValue(2));
        assertEquals("failure - should be true", true, list.hasValue(3));
        assertEquals("failure - should be false", false, list.hasValue(4));
    }
}
