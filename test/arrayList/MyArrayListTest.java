package arrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyArrayListTest {
    Student bob = new Student(1, "Bob", 25);
    Student sara = new Student(2, "Sara", 20);
    Student karl = new Student(1, "Karl", 18);
    Student kate = new Student(3, "Kate", 35);
    MyArrayList studentArrayList = new MyArrayList();

    @BeforeEach
    void setUp() {
        studentArrayList.clear();
        studentArrayList.add(bob);
        studentArrayList.add(sara);
        studentArrayList.add(karl);
    }

    @Test
    void size() {
        studentArrayList.add(kate);
        assertEquals(4, studentArrayList.size());
    }

    @Test
    void add() {
        studentArrayList.add(kate);
        assertEquals(kate, studentArrayList.get(3));
    }

    @Test
    void get() {
        Object o = studentArrayList.get(0);
        assertEquals(bob, o);
    }

    @Test
    void isEmpty() {
        studentArrayList.clear();
        assertTrue(studentArrayList.isEmpty());
    }

    @Test
    void remove() {
        assertEquals(3, studentArrayList.size());
        studentArrayList.remove(2);
        assertEquals(2, studentArrayList.size());
    }

    @Test
    void sort() {
        Object o = studentArrayList.get(0);
        Object b = studentArrayList.get(0);
        assertEquals(o,b);
        studentArrayList.sort(Comparator.comparing(Student::getStudentAge));
        Object a = studentArrayList.get(0);
        assertNotSame(o, a);
    }

    @Test
    void set() {
        Object o = studentArrayList.get(0);
        studentArrayList.set(kate, 0);
        Object a = studentArrayList.get(0);
        assertNotSame(o, a);
    }

    @Test
    void clear() {
        studentArrayList.clear();
        assertTrue(studentArrayList.isEmpty());
    }
}