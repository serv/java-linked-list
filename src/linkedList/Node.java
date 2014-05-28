package linkedList;

public class Node<T> {
    public T value;
    public Node<T> nextNode;
    
    public Node() {
        this.nextNode = null;
    }
    
    public Node(T value) {
        this.value = value;
        this.nextNode = null;
    }
    
    public String stringNodeValue() {
        return "{ " + this.value + " }";
    }
    
    public void printNode() {
        System.out.print(this.stringNodeValue());
    }
}
