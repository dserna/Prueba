package LinkedListImplementation;

import java.util.Iterator;

public class MyLinkedList<E> extends MyAbastractList<E> {
    
    private Node<E> head, tail;
    
    public MyLinkedList() {
    }
    
    public MyLinkedList(E[] elements) {
        super(elements);
    }
    
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        
        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        
        if (index <= 0) {
            addFirst(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node<E> previous = head;
            
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }
            
            newNode.next = previous.next;
            previous.next = newNode;
        }
        size++;
    }
    
    public String toString() {
        String strList = new String();
        
        Node<E> current = head;
        while (current != null) {
            strList = strList + current.element;
            current = current.next;
        }
        
        return strList;
    }
    
    @Override
    public void clear() {
        head = tail = null;
    }
    
    @Override
    public boolean contains(E e) {
        Node<E> p = head;
        
        while (p != null) {
            if (p.element == e) {
                return true;
            }
            p = p.next;
        }
        return false;
    }
    
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            Node<E> p = head;
            for (int i = 0; i < index; i++) {
                p = p.next;
            }
            return p.element;
        }
    }
    
    
    
   
    
    
     
    
    @Override
    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }
    
    @Override
    public Iterator<E> iterator() {
        return new LinkedListIerator();
    }
    
    @Override
    public boolean remove(E e) {
        Node<E> P = head;
        if (e == head.element) {
            removeFirst();
            return true;
        } else {
            if (e == tail.element) {
                removeLast();
                return true;
            } else {
                while (P != null) {
                    if (P.element == e) {
                        Node<E> Preview = head;
                        while (Preview.next != P) {                            
                            Preview=Preview.next;
                        }
                        Preview.next=P.next;
                        return true;
                    }P=P.next;
                    
                }
            }return false;
            
        }
        
    }
    
    @Override
    public E removeLast() {
        if (size == 0) {
            return null;
        } else {
            E element = tail.element;
            
            if (head == tail) {
                head = tail = null;
            } else {
                Node<E> previous = head;
                while (previous.next != tail) {
                    previous = previous.next;
                }
                previous.next = null;
                tail = previous;
            }
            size--;
            return element;
        }
        
    }
    
   
    
    
    
    private class LinkedListIerator implements java.util.Iterator {
        
        Node<E> current = head;
        
        @Override
        public boolean hasNext() {
            return (current != null);
        }
        
        @Override
        public E next() {
            if (current == null) {
                return null;
            } else {
                E element = current.element;
                current = current.next;
                
                return element;
            }
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private static class Node<E> {
        
        E element;
        Node<E> next;
        
        public Node(E element) {
            this.element = element;
        }
    }
}
