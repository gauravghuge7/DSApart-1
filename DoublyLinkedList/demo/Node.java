package demo;

public class Node {

    int val;
    Node prev;
    Node next;

    public Node(int val) {
        this.val = val;

    }
    
    
}


class LinkedLisT {
    static Node head = null;
    
    static Node tail = null;


    LinkedLisT() {

    }

    public static void Add(int val) {

        Node temp = new Node(val);

        if(head == null) {

            head = tail = temp;
        }

        tail.next = temp;
        temp.prev = tail;

        tail = temp;
    

    
    }


}

