import org.example.Animal;

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
    public String speak() {
        System.out.println(getName() + " says Meow!");
        return null;
    }

    public void scratch() {
        System.out.println(getName() + " is scratching.");
    }
}
