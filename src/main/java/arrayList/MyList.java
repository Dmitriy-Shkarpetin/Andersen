package arrayList;

import java.util.Comparator;

public interface MyList<T> {
    int size();

    void add(T object);

    void add(T object, int index);

    void remove(int index);

    void sort(Comparator<? super T> c);

    Object get(int index);

    Object set(Object o, int index);
}