package LinkedListImplementation;

public interface MyList<E> extends java.lang.Iterable<E> {

    // Add elemet e to the list
    public void add(E e);

    // Add element e to the list at the specified index
    public void add(int index, E e);

    // Clear the list
    public void clear();

    // Returns true if the list contains the element e; otherwise, returns false
    public boolean contains(E e);

    // Returns the element at position index
    public E get(int index);

    public boolean remove(E e);

    // Removes and returs the first element of the list
    public E removeFirst();
    
    // emoves and returns the last element of the list
    public E removeLast();

}
