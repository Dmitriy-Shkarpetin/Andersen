package oop.incapsulation;

 class Private {

    private String name;
    private int age;
    double salary;
    public int number;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int plusAge(int age) {
        return age + 2;
    }

    public int minusAge(int age) {
        return 18;
    }
}