package streams;

import solid.dependency_inversion.A;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {10, 46, 4, 63, 5, 4, 6, 87};
//        Arrays.stream(array).forEach(el -> {
//            el *= 2;
//            System.out.print(el + " ");
//        });
        Arrays.stream(array).forEach(Utils::myMethod);
    }
}

class Utils {
    public static void myMethod(int a) {
        a +=5;
        System.out.println("el =" + a);
    }
}