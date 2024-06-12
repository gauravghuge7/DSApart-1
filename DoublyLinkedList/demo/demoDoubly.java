package demo;

public class demoDoubly {


    public static void displayFromHead(Node head) {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        return;
    }

    public static void displayFromTail(Node tail) {

        Node temp = tail;

        while(temp.prev != null) {
            temp = temp.prev;
        }

        while(temp!= null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        return;

    }

    
    
    public static void main(String[] args) {
        

        // Node a = new Node(1);
        // Node b = new Node(2);
        // Node c = new Node(3);
        // Node d = new Node(4);
        // Node e = new Node(5);

        // a.prev = null;

        // a.next = b;
        // b.prev = a;

        // b.next = c;
        // c.prev = b;

        // c.next = d;
        // d.prev = c;

        // d.next = e;
        // e.prev = d;

        // e.next = null;

        // displayFromHead(a);
        // displayFromTail(e);

        LinkedLisT a = new LinkedLisT();

        a.Add(1);
        a.Add(3);

        displayFromHead(a.head);

        


    }
}
