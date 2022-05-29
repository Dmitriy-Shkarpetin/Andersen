package streamAPI;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Bob", "Bobby", "1", 15));
        humans.add(new Human("Bob2", "Bobby2", "2", 17));
        humans.add(new Human("Bob3", "Bobby3", "3", 25));
        humans.add(new Human("Bob4", "Bobby4", "4", 31));
        humans.add(new Human("Bob5", "Bobby5", "5", 18));

        Map<String, String> map = humans.stream()
                .peek(x -> x.setAge(x.getAge() + 1))
                .filter(age -> age.getAge() >= 18)
                .collect(Collectors.toMap(Human::getId, value -> value.getName() + " " + value.getSurname()));

        System.out.println(map);


//        Map<String, List<String>> map2 = humans.stream()
//                .peek(x -> x.setAge(x.getAge() + 1))
//                .filter(age -> age.getAge() >= 18)
//                .collect(Collectors.toMap(Human::getId, list -> List.of(list.getName(), list.getSurname())));
//

//        System.out.println(map2);
    }
}
