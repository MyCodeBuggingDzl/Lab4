package org.example;

public class Cat extends Animal {

    public static void main(String[] args) {
        Cat c = new Cat("KIKI");

        c.speak();
        c.scratch();
    }

    public Cat (String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says Meow!");
    }

    public void scratch() {
        System.out.println(getName() + " is scratching.");
    }
}
