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
        return this.count == 0;
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
        node.nextNode = null;
        
        if (this.isEmpty()) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.nextNode = node;
            this.tail = node;
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
        if (this.isEmpty()) {
            return new String();
        }
        
        String str = new String();
        Node current = this.head;
        
        str = Integer.toString(current.value);
        
        while(current.nextNode != null) {
            str += " " + current.nextNode.value;
            current = current.nextNode;
        }

        return str;
    }
    
    public void printList() {
        System.out.println(this.stringList());
    }
    
    public boolean hasValue(int value) {
        if (this.isEmpty()) {
            return false;
        }
        
        Node current = this.head;
        
        while(current != null) {
            if(current.value == value) {
                return true;
            }
            current = current.nextNode;
        }
        
        return false;
    }
}
