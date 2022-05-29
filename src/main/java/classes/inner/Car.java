package classes.inner;

public class Car {
    String colour;
    private static int doorCount; // поле видно во внутреннем классе все равно
    Engine engine;

    public Car(String colour, int doorCount, int horsePower) {
        this.colour = colour;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
        //при создании объекта внутреннего класса создается объект внешнего
        //inner class всегдя завязан на своем внешнем классе
    }

    public Car(String colour, int doorCount) {
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
        this.colour = colour;
        this.doorCount = doorCount;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car  {" +
                "colour='" + colour + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            System.out.println(doorCount);
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine  {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Car("black", 4, 300);
        System.out.println(car);

        Car car1 = new Car("white", 4);
        Car.Engine engine = car1.new Engine(150);
        car1.setEngine(engine);

        Car.Engine engine1 = new Car("yellow", 4).new Engine(410);
    }
}