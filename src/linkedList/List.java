package linkedList;

public class List {
    private int count;
    private Node head;
    private Node tail;
    
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
    
    public void addHead(int value) {
        Node node = new Node(value);
        
        if (this.isEmpty()) {
            this.head = node;
            this.tail = node;
            node.nextNode = null;
        } else {
            node.nextNode = this.head;
            this.head = node;
        }
        
        this.count++;
    }
    
    public void addTail(int value) {
        Node node = new Node(value);
        
        if (this.isEmpty()) {
            this.head = node;
            this.tail = node;
            node.nextNode = null;
        } else {
            node.nextNode = null;
            this.tail.nextNode = node;
        }
        
        this.count++;
    }
    
    public Node getHead() {
        return this.head;
    }
    
    public Node getTail() {
        return this.tail;
    }
    
    public String stringList() {
        String str = null;
        Node current = this.head;
        
        while(current.nextNode != null) {
            str += current.value + " ";
        }
        
        return " ";
    }
    
    public void printList() {
        System.out.println(this.stringList());
    }
    
}
