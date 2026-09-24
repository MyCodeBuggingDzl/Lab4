import org.example.Animal;

public class Dog extends Animal {
    public static void main(String[] args) {

     Dog d = new Dog("QIQI");
     String talk = d.speak();
     d.fetch();
    }

    public Dog (String name) {
        super(name);
    }

    @Override
    public String speak() {
        System.out.println(getName() + " say's Woof!");
        return null;
    }

    public void fetch() {
        System.out.println(getName() + " is fetching.");
    }

}
