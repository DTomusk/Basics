public class LinkedList {
    LinkedListNode head;
    LinkedListNode tail;
    int size;

    public LinkedList(Object o) {
        head = new LinkedListNode(o);
        tail = head;
        size = 1;
    }

    // adds an item to the end of the list
    public void append(Object o) {
        LinkedListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new LinkedListNode(o);
        tail = node.next;
        size ++;
    }

    public void prepend(Object o) {
        LinkedListNode node = new LinkedListNode(o);
        node.next = head;
        head = node;
        size ++;
    }

    // returns the last item in the list
    public Object pop() {
        if (size > 0) {
            LinkedListNode node = head;
            while (node.next != tail) {
                node = node.next;
            }
            size --;
            tail = node;
            return node.next.element;
        } else return null;
    }

    public Object delete() {
        Object val = head.element;
        if (head.next != null) {
            head = head.next;
        } else {
            head = null;
        }
        size --;
        return val;
    }

    // inserts a new node containing o at the index index
    public void insert(Object o, int index) {
        if (index >= size)
            return;
        LinkedListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        LinkedListNode newNode = new LinkedListNode(o);
        newNode.next = node.next;
        node.next = newNode;
        size ++;
    }

    public void print() {
        LinkedListNode node = head;
        while (node.next != null) {
            System.out.println(node.element);
            node = node.next;
        }
    }
}
