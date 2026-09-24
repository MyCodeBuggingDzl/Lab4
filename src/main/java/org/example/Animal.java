package org.example;


public class Animal {

    private String name;

    public static void main(String[] args) {

    }

    public Animal (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        System.out.println(name);
        return null;
    }
}
