package linkedList;

public class Node {
    public double value;
    public Node nextNode;
    
    public Node(double value) {
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
