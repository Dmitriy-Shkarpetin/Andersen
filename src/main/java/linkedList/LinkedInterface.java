package linkedList;

import java.util.Comparator;

public interface LinkedInterface<E>  {

    void add(E e);

    int size();

    void sort(Comparator<? super E> c);

    void clear();
}