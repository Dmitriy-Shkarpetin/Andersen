package classes.nested;

public class Car {
    String colour;
    int doorCount;
    Engine engine;

    void method() {
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    public Car(String colour, int doorCount, Engine engine) {
        this.colour = colour;
        this.doorCount = doorCount;
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

    public static class Engine {
        int horsePower;
        static  int countOfObjects;

        public Engine(int horsePower) {
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
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);

        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}