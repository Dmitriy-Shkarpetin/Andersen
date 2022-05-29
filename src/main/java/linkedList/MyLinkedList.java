package linkedList;

import java.util.Arrays;
import java.util.Comparator;

public class MyLinkedList<E> implements LinkedInterface<E> {
    E[] a;
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    static class Node<E> {
        Node<E> next;
        E value;

        Node(E value) {
            this.value = value;
        }
    }

    public void sort(Comparator<? super E> c) {
        this.a = (E[]) new Object[size];
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            a[i] = temp.value;
            temp = temp.next;
        }
        Arrays.sort(a, c);
    }

    public E getFirst() {
        return head.value;
    }

    public E getLast() {
        return tail.value;
    }

    public void add(E val) {
        Node<E> temp = new Node(val);
        temp.next = head;
        head = temp;
        if (tail == null) {
            tail = temp;
        }
        size++;
    }

    public void clear() {
        Node<E> temp = head;
        if (head != null) {
            while (temp.next != null) {
                head = null;
                temp = temp.next;
                head = temp;
            }
            head = tail = null;
            size = 0;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node<E> temp = head;

        for (int i = 0; i < size; i++) {
            builder.append(temp.value);
            if (i + 1 < size) {
                builder.append(", ");
                temp = temp.next;
            }
        }
        return builder.append("]").toString();
    }
}