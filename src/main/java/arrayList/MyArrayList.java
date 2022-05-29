package arrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class MyArrayList<T> implements MyList<T> {
    private T[] values;
    private int size;
    private final static int DEFAULT_SIZE = 10;
    private int arraySize = DEFAULT_SIZE;

    public MyArrayList() {
        values = (T[]) new Object[DEFAULT_SIZE];
    }

    public MyArrayList(Collection<? extends T> c) {
        if (c.size() > 0) {
            values = (T[]) c.toArray();
            size = values.length;
            arraySize = size;
            grow();
        }
    }

    public MyArrayList(int initialCapacity) {
        values = (T[]) new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T object) {
        grow();
        values[size] = object;
        size++;
    }

    @Override
    public void add(T object, int index) {
        grow();
        System.arraycopy(values, index, values, index + 1, size - index);
        values[index] = object;
        ++size;
    }

    public Object get(int index) {
        if (index < size && index >= 0) {
            return values[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void remove(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(values, index + 1, values, index, size - index - 1);
        values[--size] = null;
        grow();
    }

    @Override
    public void sort(Comparator<? super T> c) {
        Arrays.sort( values, 0, size, c);
    }

    public Object set(Object o, int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Object oldObject = values[index];
        values[index] = (T) o;
        return oldObject;
    }

    private void grow() {
        if (size >= arraySize) {
            Object[] newValues = new Object[size * 3 / 2 + 1];
            System.arraycopy(values, 0, newValues, 0, size);
            values = (T[]) newValues;
        }
        if (size >= DEFAULT_SIZE && size < arraySize / 4) {
            Object[] newValues = new Object[size * 3 / 2 + 1];
            System.arraycopy(values, 0, newValues, 0, size);
            values = (T[]) newValues;
        }
    }

    public void clear() {
        for (Object value : values) {
            value = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "values=" + Arrays.toString(values) +
                ", size=" + size +
                ", arraySize=" + arraySize +
                '}';
    }
}