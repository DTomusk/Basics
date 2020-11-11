public class LinkedList {
    LinkedListNode head;
    int size;

    public LinkedList(Object o) {
        head = new LinkedListNode(o);
        size = 1;
    }

    public void append(Object o) {
        LinkedListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new LinkedListNode(o);
        size ++;
    }
}
