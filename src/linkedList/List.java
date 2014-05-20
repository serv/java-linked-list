package linkedList;

public class List {
    private static int count;
    private static Node head;
    private static Node tail;
    
    public List() {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public boolean isEmpty() {
        return (this.count == 0 && this.head == null && this.tail == null);
    }
    
    
    
}
