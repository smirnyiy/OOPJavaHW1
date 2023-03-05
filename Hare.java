

public class Hare extends Animal {
    public Hare(String name, String color) {
        super(name, color,4);
    }

    public Hare(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("ZZZzzz!");
    }

    public void fly() {
        System.out.println("Зайцы не летают!!");
    }

    public void swim() {
        System.out.println("Зайцы не плавают!!");
    }
}