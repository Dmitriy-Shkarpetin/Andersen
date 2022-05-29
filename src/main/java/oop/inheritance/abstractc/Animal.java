package oop.inheritance.abstractc;

public abstract class Animal {
    String name;
    String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    abstract void run();

    abstract void jump();
}

class Dog extends Animal {

    @Override
    void run() {
        System.out.println("Dog run");
    }

    @Override
    void jump() {
        System.out.println("Dog jump");
    }
}