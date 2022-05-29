package streams;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(51);
        list.add(25);
        list.add(15);
        list.add(35);

        int result = list.stream().reduce((acc, el) -> acc * el).get();
      //  System.out.println(result);

        int result1 = list.stream().reduce(1, (acc, el) -> acc * el);
      //  System.out.println(result1);

        List<String> list2 = new ArrayList<>();
        list2.add("privet");
        list2.add("kak dela");
        list2.add("ok");
        list2.add("poka");
        String result2 = list2.stream().reduce((acc, el) -> acc + "  " + el).get();
        System.out.println(result2);
    }
}
