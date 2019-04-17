public interface Stack<E> {
    /**
     * Abstract data representation for stack
     */
    int size();
    boolean isEmpty();
    void push(E object);
    E pop();
    E top();
}
