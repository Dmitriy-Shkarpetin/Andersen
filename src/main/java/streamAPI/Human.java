package streamAPI;

public class Human {
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private String surname;
    private String id;
    private int age;

    public Human() {
    }



    public Human(String name, String surname, String id, int age) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
