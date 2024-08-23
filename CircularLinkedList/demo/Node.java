package demo;

public class Node {
    
    int val;
    Node prev;
    Node next;

    public Node(int val) {

        this.val = val;
    }


}

class circular {
 
    Node head = null;
    Node tail = null;
    
    public circular() {}

    public void add(int val) {
        
        Node temp = new Node(val);

        if(head == null ) head = tail = temp;

        tail.next = temp;
        tail.prev = temp;
        temp.prev = tail;
        temp.next = tail;

        tail = temp;
 
    }
    
}
