package oop.inheritance.isa;

public class Animal implements FlyAble{}

class Cat extends Animal{
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat instanceof Animal);
    }
}
// is CAT THE ANIMAL
// the cat IS the animal