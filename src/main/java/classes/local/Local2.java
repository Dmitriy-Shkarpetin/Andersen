package classes.local;

public class Local2 {
    public static void main(String[] args) {
        class Plus implements Math2 {

            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Plus plus = new Plus();
        System.out.println(plus.doOperation(4, 6));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}