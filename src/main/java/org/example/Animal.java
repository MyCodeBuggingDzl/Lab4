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



        Animal animal = new Dog("BuddyD");
        animal.speak();
//        animal.fetch;


        Dog dog = new Dog("BuddyE");
        Animal anima1 = dog;
        anima1.speak();


        Animal animal1 = new Dog("BuddyF");
        Dog dog1 = (Dog) animal1;
        dog1.fetch();




        Animal first = new Dog("Buddy");
        Animal second = new Cat("Mittens");

        if (first instanceof Dog) {
            Dog dog2 = (Dog) first;
            dog2.fetch();
        }
        if (second instanceof Cat) {
            Cat cat = (Cat) second;
            cat.scratch();
        }



//        Animal animalH = new Cat("MittensH");
//        Dog dogH = (Dog) animalH;
//        dogH.fetch();
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
