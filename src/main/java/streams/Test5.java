package streams;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {10, 46, 4, 63, 5, 4, 6, 87};
//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));

        int result = Arrays.stream(array).filter(el -> el%2 == 1)
                .map(el -> { if(el%3 == 0) { el=el/3;}
                    return el;
                })
                .reduce(Integer::sum).getAsInt();
        System.out.println(result);
    }
}
