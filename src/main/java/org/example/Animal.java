package org.example;


import java.util.ArrayList;

public class Animal {

    private String name;

    public static void main(String[] args) {

        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Mittens");
        Animal a3 = new Frog("Kermit");

        a1.speak();
        a2.speak();
        a3.speak();



        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Buddy"));
        animals.add(new Cat("Mittens"));
        animals.add(new Frog("Kermit"));
        animals.add(new Dog("Rex"));
        animals.add(new Cat("Luna"));

        for (Animal animal : animals) {
            animal.speak();
        }



        Animal animal = new Dog("Buddy");
        animal.speak();
//        animal.fetch;

    }

    public Animal (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak() {
        System.out.println(name);
    }
}
