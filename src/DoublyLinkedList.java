public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    /**
     * Constructor
     */
    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Adds an item to the end of the list
     * @param data the item to add
     */
    public void add(Object data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    /**
     * Print the contents of the list
     */
    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty!");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current);
                current = current.getNext();
            }
        }
    }

    /**
     * Print the contents of the list from the back
     */
    public void printBackwards() {
        if (isEmpty()) {
            System.out.println("List is empty!");
        } else {
            Node current = tail;
            while (current != null) {
                System.out.println(current);
                current = current.getPrevious();
            }
        }
    }

    /**
     * Add a new node to the head of the list
     * @param data the item to add
     */
    public void addAtHead(Object data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        size++;
    }

    /**
     * Delete the node at the tail of the list
     */
    public void delete() {
        if (isEmpty()) {
            System.out.println("List is empty!");
        } else if (size == 1) {
            head = null;
            tail = null;
            size = 0;
        } else {
            tail = tail.getPrevious();
            tail.setNext(null);
            size--;
        }
    }

    /**
     * Delete the node at the head of the list
     */
    public void deleteAtHead() {
        if (isEmpty()) {
            System.out.println("List is empty!");
        } else if (size == 1) {
            head = null;
            tail = null;
            size = 0;
        } else {
            head = head.getNext();
            head.setPrevious(null);
            size--;
        }
    }

    /**
     * Check if the list is empty
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Get the size of the list
     * @return the size of the list
     */
    public int getSize() {
        return size;
    }
}
