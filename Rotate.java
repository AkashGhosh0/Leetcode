public class Rotate {
    private Node head;
    private Node tail;

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertData(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }

    public String printList(){
        StringBuilder sp = new StringBuilder();
        if(head == null){
            System.out.println("null");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println(", tail = " + tail.value);
        return sp.toString();
    }

    public void reverse() {
        Node prev = null, current = head, next = null;
        tail = head; // old head becomes new tail
        int count = 0;

        while (count != 2) {
            next = current.next;   // store next
            current.next = prev;   // reverse link
            prev = current;        // move prev
            current = next;        // move current
            count += 1; 
        }
        head = prev; // new head
    }

    public static void main(String[] args) {
        Rotate list = new Rotate();
        list.insertData(10);
        list.insertData(20);
        list.insertData(30);

        System.out.println("Original list:");
        list.printList();

        

        // System.out.println("Reversed list: "+ list.reverse());
        
    }
}
