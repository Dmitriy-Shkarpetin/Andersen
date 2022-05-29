package classes.anonimous;

public class Anonymous {
    private int x = 654;
    public static void main(String[] args) {
        Math m = (a, b) -> a + b;

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                Anonymous anonymous = new Anonymous();
                return a * b + anonymous.x;
            }
        };

        System.out.println(m.doOperation(5,6));
        System.out.println(m2.doOperation(5,6));
    }
}

interface Math {
    int doOperation(int a, int b);
}