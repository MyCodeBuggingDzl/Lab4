import org.example.Animal;

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
    public String speak() {
        System.out.println(getName() + " says Ribbit");
        return null;
    }

    public void jump() {
        System.out.println(getName() + " is jumping");
    }
}
