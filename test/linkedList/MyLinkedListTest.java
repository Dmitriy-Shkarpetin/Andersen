package linkedList;

import arrayList.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    Student bob = new Student(1, "Bob", 17);
    Student jule = new Student(5, "Jule", 25);
    Student frank = new Student(2, "frank", 20);
    Student tom = new Student(4, "Tom", 55);
    MyLinkedList<Student> studentsList = new MyLinkedList<>();

    @BeforeEach
    void setUp() {
        studentsList.clear();
        studentsList.add(bob);
        studentsList.add(jule);
        studentsList.add(frank);
    }

    @Test
    void sort() {
        Object o = studentsList.getFirst();
        studentsList.sort(Student::compareTo);
        Object a = studentsList.getFirst();
        assertNotEquals(o, a);
    }

    @Test
    void addFirst() {
        studentsList.add(tom);
        assertEquals(tom, studentsList.getFirst());
    }

    @Test
    void clear() {
        studentsList.clear();
        assertEquals(0, studentsList.size());
    }

    @Test
    void size() {
        studentsList.add(tom);
        assertEquals(4, studentsList.size());
    }
}