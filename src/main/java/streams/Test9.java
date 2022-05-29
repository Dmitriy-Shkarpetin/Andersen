package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 33, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
//        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(min);
//        System.out.println(max);

//        students.stream().filter(el -> el.getAge() > 20).limit(2).forEach(System.out::println); //ограничивает кол-во элементов
//        students.stream().filter(el -> el.getAge() > 20).skip(2).forEach(System.out::println); //пропускает элементы

//        List<Integer> courses = students.stream().mapToInt(Student::getCourse).boxed().collect(Collectors.toList());
            double courses = students.stream().mapToDouble(Student::getAvgGrade).sum();

        System.out.println(courses);

    }
}
