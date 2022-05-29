package classes.local;

public class Local {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    private int a = 10;

    public void getResult() {
        float x = 21;
        //если после инициализации переменной ее значение не меняется,
        // то эта переменная называется effectively final
        class Division {  //access mod doesn't use

            private float y;

            public float getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }

            public float getResult() {
                return x / y;
            }

            public float getSurplus() {
                return x % y;
            }
        }

        Division division = new Division();
//        division.setX(21);
        division.setY(4);
        System.out.println(division.getResult());
        System.out.println(division.getSurplus());
        System.out.println(a);
    }
}