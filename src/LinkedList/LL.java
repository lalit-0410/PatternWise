package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size=0;

    public LL() {
        this.size = 0;
    }

    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
