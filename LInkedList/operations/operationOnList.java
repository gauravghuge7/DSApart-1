package operations;

public class operationOnList {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }


    public static void display(Node head) {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }



    public static class Linkedlist {

        Node head = null;
        Node tail = null;

        Linkedlist() {
            head = null;
            tail = null;
        }

        void add(int data) {
            Node temp = new Node(data);
            if(head == null) {
                head = temp;
            }
            else {
                tail.next = temp;
            }

            tail = temp;
        }


        void insertAtStart(int data) {

            Node temp = new Node(data);

            if(head == null) {

                head = temp;
            }

            else {
                temp.next = head;
                head = temp;
            }
        }


        int size() {
            int count = 0;

            Node temp = head;

            while(temp != null) {
                count++;
                temp = temp.next;
            }

            return count;
        }
        

        void insertAt(int index, int data) {

            if(index == 0) {
                insertAtStart(data);
                return;
            }

            if(index == size()) {
                add(data);
                return;
            }

            if(index < 0 && index > size()) {
                System.out.println("Index out of bound");
                return;
            }



            Node t = new Node(data);

            Node temp = head;

            for(int i=1; i<index; i++) {
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;


        }

    }

    
    public static void main(String[] args) {
        
        Linkedlist list = new Linkedlist();
        
        
        list.add(2);
        list.add(3);
        list.add(4); 
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
     

        // display(list.head);

        list.insertAtStart(7);

        display(list.head);
        System.out.println();

        list.insertAt(2, 10);   /// 4 == 10
        display(list.head);



       

    }
}
