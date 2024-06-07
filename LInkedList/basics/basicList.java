
class basicList {

    public static void displayI(Node a) {

        Node h = a;

        while(h!= null) {
            System.out.print(h.data+ " ");
            h = h.next;
        }
    }

    public static void displayR(Node a) {
        
        if(a == null) return;

        System.out.print(a.data+ " ");

        displayR(a.next);
    }

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            
            this.data = data;

        }
    }


    public static void main(String[] args) {
        
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
       

        // while (a != null) {
            
        //     System.out.println(a.data);
        //     a = a.next;
        // }
        
        displayR(a);

    }
}