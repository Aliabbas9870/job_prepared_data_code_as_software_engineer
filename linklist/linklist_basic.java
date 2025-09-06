
public class linklist_basic {

    public Node head;
    private int size;

    linklist_basic() {
        this.size = 0;
    }

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    // add in the last
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;

        }
        curNode.next = newNode;
        size++;
    }

    public void prints() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node lastNode = head.next;
        Node secondlast = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public void getSize() {
        System.out.println("size of linklist is: " + size);
    }

    public static void main(String[] args) {
        System.out.println("welcome linklist basic!");

        linklist_basic ll = new linklist_basic();
        ll.addFirst("a");
        ll.addFirst("b");
        ll.addFirst("c");
        ll.addFirst("a");

        ll.addLast("z");
        ll.addLast("dd");
        ll.addLast("z");
        ll.addFirst("alis");
        ll.deleteFirst();
        ll.deleteLast();
        ll.prints();
        System.out.println(ll.size);

    }
}
