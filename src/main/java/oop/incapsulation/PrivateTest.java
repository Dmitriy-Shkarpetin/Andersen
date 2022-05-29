package oop.incapsulation;

public class PrivateTest {

    public static void main(String[] args) {
        Private test = new Private();
        test.setAge(25);
        System.out.println(test.getAge());

        test.salary = 1_500_000;
        test.number = 321;

        System.out.println(test.salary);
        System.out.println(test.number);

        System.out.println(test.minusAge(25));

    }
}