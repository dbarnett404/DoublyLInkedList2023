public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add("ant");
        doublyLinkedList.add("bee");
        doublyLinkedList.add("cat");
        doublyLinkedList.addAtHead("duck");
        doublyLinkedList.delete();
        doublyLinkedList.print();
        System.out.println("Print backwards");
        doublyLinkedList.printBackwards();
    }
}