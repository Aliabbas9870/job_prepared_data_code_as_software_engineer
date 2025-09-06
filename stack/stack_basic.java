
public class stack_basic {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    static class Stack {

        boolean isEmpty() {
            return head == null;

        }

        void push(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }

        void pop() {
            int top = head.data;
            head = head.next;
            System.out.println("poped element is " + top);

        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        System.out.println("Stack DSA");
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
