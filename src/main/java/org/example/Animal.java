package org.example;


public class Animal {

    private String name;

    public static void main(String[] args) {

        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Mittens");
        Animal a3 = new Frog("Kermit");

        a1.speak();
        a2.speak();
        a3.speak();

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
