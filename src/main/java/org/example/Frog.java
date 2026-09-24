package org.example;

public class Frog extends Animal {

    public static void main(String[] args) {

        Frog f = new Frog("COCO");

        f.speak();
        f.jump();
    }

    public Frog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says Ribbit");
    }

    public void jump() {
        System.out.println(getName() + " is jumping");
    }
}
