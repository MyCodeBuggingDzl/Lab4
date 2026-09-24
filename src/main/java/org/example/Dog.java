package org.example;

public class Dog extends Animal {
    public static void main(String[] args) {

     Dog d = new Dog("QIQI");
     d.speak();
     d.fetch();
    }

    public Dog (String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " say's Woof!");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching.");
    }

}
