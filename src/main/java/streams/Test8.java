package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
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

//        Map<Integer, List<Student>> listMap = students.stream().map(el ->
//                {
//                    el.setName(el.getName().toUpperCase());
//                    return el;
//
//                })
//                .collect(Collectors.groupingBy(Student::getCourse));
//        for (Map.Entry<Integer, List<Student>> e : listMap.entrySet()) {
//            System.out.println(e.getKey() + " : " + e.getValue());
//        }

        Map<Boolean,List<Student>> listMap1 =  students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));
        for (Map.Entry<Boolean, List<Student>> e : listMap1.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}