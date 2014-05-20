package linkedList;

public class Node {
    public int value;
    public Node nextNode;
    
    public Node() {
        this.nextNode = null;
    }
    
    public Node(int value) {
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
