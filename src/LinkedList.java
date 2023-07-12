public interface LinkedList <T>{
    /**
     * Adds an item to the beginning of the list.
     */
    void addFirst(T t);

    /**
     * Add an item to the end of the list
     */
    void addLast(T t);

    /**
     * Remove an item from the beginning of the list.
     * @return
     */
    T removeFirst();

    /**
     * Remove an item from the end of the list
     * @return
     */
    T removeLast();

    /**
     * Get the item at the beginning of the list
     * @return
     */
    T getFirst();

    /**
     * Get the item at the end of the list
     * @return
     */
    T getLast();

    /**
     * Number of items in the list
     * @return
     */
    int size();
}
