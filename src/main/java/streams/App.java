package streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Bob", 65, "1", "Marly"));
        humans.add(new Human("Ricky", 25, "2", "Boobie"));
        humans.add(new Human("Stanly", 95, "3", "Kubrik"));
        humans.add(new Human("Mik", 78, "4", "Jager"));
        humans.add(new Human("Barbara", 61, "5", "Liskov"));

        List<Integer> plusOneToAge = humans.stream().map(e -> e.getAge() + 1).collect(Collectors.toList());
        System.out.println(plusOneToAge);

        List<Human> olderThanSevenTeen = humans.stream().filter(e -> e.getAge() > 17).collect(Collectors.toList());
        System.out.println(olderThanSevenTeen);

        Map<String, String> mapOfNameAndSurname = humans.stream().collect(Collectors.toMap(Human::getId,
                                        v -> (v.getName() + v.getSurname())));
        System.out.println(mapOfNameAndSurname);
    }
}