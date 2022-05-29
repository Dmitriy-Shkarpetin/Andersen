package arrayList;

import java.util.Objects;

public class Student implements Comparable {
    private String studentName;
    private int rollNo;
    private int studentAge;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && studentAge == student.studentAge && Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, rollNo, studentAge);
    }

    public Student(int rollNo, String studentName, int studentAge) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.studentAge = studentAge;

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int compareTo(Student comparesTo) {
        int compareAge = comparesTo.getStudentAge();
        return this.studentAge - compareAge;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "arrayList.Student{ " +
                "studentName='" + studentName + '\'' +
                ", rollNo=" + rollNo +
                ", studentAge=" + studentAge +
                '}' + '\n';
    }

}