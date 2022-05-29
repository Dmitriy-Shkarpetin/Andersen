package streams;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("ok");
        list.add("poka");

        List<Integer> list1 = list.stream().map(String::length).collect(Collectors.toList());
       // System.out.println(list1);

        int[] array = {10, 46, 4, 63, 5, 4, 6, 87};
        array = Arrays.stream(array).map(el ->
        {
            if (el % 4 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();
      //  System.out.println(Arrays.toString(array));
        }
    }